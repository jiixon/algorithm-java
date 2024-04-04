
import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        ArrayList<String> inputs = new ArrayList<>();
        while (t != 0) {
            if (t == 0) break;
            String input = bf.readLine();
            inputs.add(input);
            t--;
        }
        System.out.println(inputs);

        int result = 0;
        ArrayList<Character> check = new ArrayList<>();
        boolean c = false;
        for (int i = 0; i < inputs.size(); i++) {

            for (int j = 0; j < inputs.get(i).length(); j++) {

                for(int k = j+1; k<inputs.get(i).length(); k++){
                    if(inputs.get(i).charAt(j)==inputs.get(i).charAt(k)){

                    }


                }

            }
            System.out.println(check);
            if(c) result++;
            c = false;
            check.clear();
        }
        System.out.println(result);


    }
}