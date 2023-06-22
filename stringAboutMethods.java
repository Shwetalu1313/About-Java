import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class stringAboutMethods {
    public static void main(String[] args) {

        String contents = "I am writing this text cuz I am so boring and cannot think what should I write for";
        System.out.println(contents.charAt(23)); // getting char with index num

        System.out.println(contents.substring(13)); // သတ်မှတ်ထားတဲ့ index ကနေပီးစယူ
        System.out.println(contents.substring(13,17)); // range အတွင်းကရှာ

        System.out.println(contents.contains("j")); //စာလုံးပါမပါစစ်

        System.out.println(contents.isEmpty()); //စာတန်းရှိမရှိစစ်

        String girl = "😉";
        String boy = "💦";

        System.out.println(girl.concat(boy)); // string နှစ်ခုကိုပေါင်းတာ //stringbuilder ကအများကြီးပေါင်းလို့ရတယ်

        String chrchk = "WAWA";
        chrchk = chrchk.replace('W','H'); // character ကို ပြန်ပြောင်း
        System.out.println(chrchk);

        String chgcontents =  contents.replace("am","was"); // စာလုံးတွဲ သို့ စာလုံးကိုပြောင်း
        System.out.println(chgcontents);

        // စာလုံးတူညီကြောင်းကိုစစ်ဆေးသည်မှာ နှစ်မျိုးရှိပါသည်။ contains အဓိကရည်ရွယ်ချက်မှာ စာတန်းထဲရှိ စာလုံးကိုသာရှာခြင်းဖြစ်သည်။ အောက်တွင်မူ မတူ။
        String name1 = "Mg Mg";
        String name2 = "MG MG";
        System.out.println("ရိုးရိုးစစ်ဆေးခြင်း အကုန်လုံးတူညီရန်လိုအပ်သည်။ အဖြေမှာ - "+name1.equals(name2));
        System.out.println("capital or small letter အရေးမကြီး တူညီကြောင်းစစ်။ အဖြေမှာ - "+name1.equalsIgnoreCase(name2));

        String []ary = chgcontents.split(" ");
        // space တစ်ချက်ခြားလိုက်တိုင်း စာလုံးတစ်လုံးစီသည် index တစ်ခု၏တန်ဖိုးဖြစ်သွားမည်။
        // အဘယ်ကြောင့်ဆိုတန်ဖိုးတစ်နေရာဆုံးဖြတ်ရာတွင် space ကို အသုံးပြုထားခြင်းကြောင့်ဖြစ်ပေသည်။

        String[] ary1 = chgcontents.split(" ",5);
        // ထိုအရာသည် index 5 နေရာသာယူမည်ဖြစ်ကြောင်း limit လုပ်ထားသည်။

        System.out.println(Arrays.toString(ary));
        System.out.println(Arrays.toString(ary1));

        // trims သည် space bar ခြားထားသော‌နေရာများကို ဖျက်ပြစ်သည်။
        String comma = "Banana, Apple, Orange, Mango";
        String[] arrcomma  = comma.split(",");
        for (int i = 0; i < arrcomma.length; i++) {
            System.out.println(arrcomma[i].trim());
        }

        //valueof() သည် မည်သည့်တန်ဖိုးကိုမဆို string သို့ပြောင်းပေးသည်။
        boolean bool = true;
        int a = 1, b = 2;
        String c = String.valueOf(a)+String.valueOf(b);
        System.out.println(String.valueOf(bool));
        System.out.println("String: "+c);

        //join
        String jooky = "";
        jooky = jooky.join(":: ","one","two","three");
        System.out.println(jooky);

        ArrayList <String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("forth");
        String liststr = "";
        liststr = liststr.join(">>",list);
        System.out.println(liststr);

        //String Builder -> String ၏ interface တစ်ခုဖြစ်ပေသည်။
        //String များကို ဆက်ပေးသည်။
        //သို့သော် သူ၏နောက်ဆုံးပေါင်းစည်းထားသောစာတန်း၏ ဒေတာအမျိုးအစားမှာ string မဟုတ်ပေ။
        StringBuilder sb = new StringBuilder();
        sb.append("hey, ");
        sb.append("girl ");
        sb.append("What is your name?");
        String sbstr = sb.toString();
        System.out.println(sbstr);

        //String formatter (specific aka placeholder များကိုအသုံးပြုပြီးရိုက်ထုတ်ခြင်း)
        //specific အသုံးပြုပုံသည် data structure အမျိုးအစားအပေါ်မူတည်ပြီးကွဲပြားသေးသည်။
        String boy1 = "Shwe";
        String boy2 = "Ta lu";
        System.out.printf("His name is %s %s.",boy1,boy2); //%s သည် စားသားတန်ဖိုးများကိုလက်ခံပေးသော specificer ဖြစ်သည်။
        System.out.println();

        LocalDateTime local = LocalDateTime.of(2023,6,22,10,58,32);
        System.out.printf("Current time is %tY %<tB", local); //less than sign ကို အသုံးပြုထားသည်ကို သတိပြုပါ။

        

    }
}
