import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String log = "SW Eltex MES1124 УД АТС-66 388-22-66-СОШ №1 MES-1124 (172.16.16.93):03 /nSW D-Link DES-1210-28/ME УД АТС-45 МБОУ DES-1210-28 (172.16.252.170) /nSW D-Link DES-1210-28/ME 385-4 Бийск ПСЭ-32/2 32/2-106/5(ОКН) DES-1210-28(ОКН) (10.50.140.206):02 /nкрс 2036 35 (1) штк СТШ2036-001 d2036-3(10.54.20.124) 0/0";

        Pattern pattern = Pattern.compile("\\(\\d+\\.\\d+\\.\\d+\\.\\d+\\)");
        Matcher matcher = pattern.matcher(log);



        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();



            System.out.println(log.substring(start+1, end-1));


        }

    }
}