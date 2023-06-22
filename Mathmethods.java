public class Mathmethods {
    public static void main(String[] args) {
        //abs ==> absolute value (အမည်သည့်လက်ခဏ္ဏာကို မဆို အပေါင်းကိုပြောင်းပေးပါသည်။
        int a = 10, b =-10;
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));

        //celi ==> celling(မျက်နှာကျက်) ဒသမတိုးယူ
        //floor ==> ကြမ်းပြင် ဒဿမလျော့ယူ
        double c = 2.66;
        System.out.println(Math.ceil(c)); //3.0
        System.out.println(Math.floor(c)); //2.0

        //Min & Max
        // တန်ဖိုးနှစ်ကိုယှည်ပြီး အကြီးဆုံး / သေးဆုံးတန်ဖိုးကိုထုတ်ပေးပါတယ်ချစ်သား
        int d = 1;
        int e = 2;
        System.out.println("max "+Math.max(d,e));
        System.out.println("min "+Math.min(d,e));

        //pow (power တင်ခြင်းနှင့်တူညီသည်)
        System.out.println("Power :"+Math.pow(c,e)); //d*d*d

        //random
        for (int i = 0; i < 3; i++) {
            System.out.println((int)(Math.random()*100));
        }

        //round (celi နှင့်တူသည်)
        double f = 30.6;
        System.out.println("Round value: "+Math.round(f));
    }
}
