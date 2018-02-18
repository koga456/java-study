package mylib;
/**
 * 作者 BLUEPIXYさん
 * http://blog.livedoor.jp/p-1956050/archives/27234794.html　（2012.05.19 確認）
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

//π/4=tan-1(1)=1-1/3+1/5-1/7+…は、収束が遅すぎる
/* ガウス・ルジャンドルの公式
１．初期値
    a = 1
    b = 1 / sqrt( 2 )
    t = 1 / 4
    x = 1

２．a と b が求めようとする精度以上に十分等しくなるまで下の式を反復
    y = a
    a = ( a ＋ b ) / 2
    b = sqrt( b ･ y ) 
    t = t － x ･ ( y － a )^2
    x = 2 ･ x

３．収束した a , b および t の値を用いて、πの値は、
    π = ( a ＋ b )^2 / ( 4 ･ t )

４．使い方

	public static void main(String ar[]){
    	System.out.println(Pai.pai(100));
	}
*/
public final class Pai {
    static BigDecimal pai;
    static int scale;
    static {
        Pai.pai = Pai.calc(100);//最初に１００桁分求める
    }
    private Pai(){};
    static public BigDecimal sqrt(BigDecimal a, int scale){
    	/* sqrt(a)=x=(x^2+a)/2x */
        scale*=2;//２倍の精度で求める
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
        	//要求桁数が保持してる桁数より小さい時は、単に桁数を変換して返す
            return pai.setScale(scale, RoundingMode.HALF_EVEN);
        }
        //要求される桁数が保持している桁数より大きいので、更新する
        Pai.scale=scale;
        scale*=2;//内部的に２倍の精度で計算する
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