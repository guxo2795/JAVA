package 백준.단계별.단계6_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int cnt =0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            switch (ch) {
                case 'c' :
                    if(i + 1 < str.length() && (str.charAt(i+1) == '=' || str.charAt(i+1) == '-')) {
                        i++;
                    }
                    cnt++;
                    break;
                case 'd' :
                    if(i + 2 < str.length() && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
                        i += 2;
                    } else if (i + 1 < str.length() && str.charAt(i+1) == '-') {
                        i++;
                    }
                    cnt++;
                    break;
                case 'l' : case 'n' :
                    if(i + 1 < str.length() && str.charAt(i+1) == 'j') {
                        i++;
                    }
                    cnt++;
                    break;
                case 's' : case 'z' :
                    if(i + 1 < str.length() && str.charAt(i+1) == '=') {
                        i++;
                    }
                    cnt++;
                    break;
                default:
                    cnt++;
                    break;
            }
        }
        System.out.println(cnt);
    }
}
