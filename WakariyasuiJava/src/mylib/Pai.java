package mylib;
/**
 * ��� BLUEPIXY����
 * http://blog.livedoor.jp/p-1956050/archives/27234794.html�@�i2012.05.19 �m�F�j
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

//��/4=tan-1(1)=1-1/3+1/5-1/7+�c�́A�������x������
/* �K�E�X�E���W�����h���̌���
�P�D�����l
    a = 1
    b = 1 / sqrt( 2 )
    t = 1 / 4
    x = 1

�Q�Da �� b �����߂悤�Ƃ��鐸�x�ȏ�ɏ\���������Ȃ�܂ŉ��̎��𔽕�
    y = a
    a = ( a �{ b ) / 2
    b = sqrt( b � y ) 
    t = t �| x � ( y �| a )^2
    x = 2 � x

�R�D�������� a , b ����� t �̒l��p���āA�΂̒l�́A
    �� = ( a �{ b )^2 / ( 4 � t )

�S�D�g����

	public static void main(String ar[]){
    	System.out.println(Pai.pai(100));
	}
*/
public final class Pai {
    static BigDecimal pai;
    static int scale;
    static {
        Pai.pai = Pai.calc(100);//�ŏ��ɂP�O�O�������߂�
    }
    private Pai(){};
    static public BigDecimal sqrt(BigDecimal a, int scale){
    	/* sqrt(a)=x=(x^2+a)/2x */
        scale*=2;//�Q�{�̐��x�ŋ��߂�
        a=a.setScale(scale, RoundingMode.HALF_EVEN);
        BigDecimal x = a.divide(new BigDecimal(2), RoundingMode.HALF_EVEN);
        int c=(int)Math.round(Math.log(scale)/Math.log(2));
        for(int i=0;i<c;i++)
            x=x.pow(2).add(a).divide(x.add(x),scale,RoundingMode.HALF_EVEN);
        return x.setScale(scale/2, RoundingMode.HALF_EVEN);
    }
    static public BigDecimal calc(int scale){
        if(Pai.scale==scale){
            return Pai.pai;
        }
        if(Pai.scale > scale){
        	//�v���������ێ����Ă錅����菬�������́A�P�Ɍ�����ϊ����ĕԂ�
            return pai.setScale(scale, RoundingMode.HALF_EVEN);
        }
        //�v������錅�����ێ����Ă��錅�����傫���̂ŁA�X�V����
        Pai.scale=scale;
        scale*=2;//�����I�ɂQ�{�̐��x�Ōv�Z����
        BigDecimal one = BigDecimal.ONE;
        BigDecimal two = new BigDecimal(2);
        one=one.setScale(scale);
        two=two.setScale(scale);
        BigDecimal a = one;
        BigDecimal b = one.divide(Pai.sqrt(two, scale), RoundingMode.HALF_EVEN);
        BigDecimal t = one.divide(new BigDecimal(4), RoundingMode.HALF_EVEN);
        BigDecimal x = one;
        BigDecimal y;
        int c=(int)Math.round(Math.log(scale)/Math.log(2));
        for(int i=0;i<=c;i++){
            y = a;
            a = a.add(b).divide(two, RoundingMode.HALF_EVEN);
            b = Pai.sqrt(b.multiply(y), scale);
            t = t.subtract(x.multiply(y.subtract(a).pow(2)));
            x = x.add(x);
        }
        Pai.pai=a.add(b).pow(2).divide(t.multiply(new BigDecimal(4)),scale,RoundingMode.HALF_EVEN);
        Pai.pai=pai.setScale(Pai.scale, RoundingMode.HALF_EVEN);
        return Pai.pai;
    }

}