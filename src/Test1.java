import java.util.Scanner;

class Test1{
    public String moveRobot(int input1, int input2,String input3,String input4) {
        String str = "";
        int x = Integer.parseInt(input3.substring(0, 1));
        int y = Integer.parseInt(input3.substring(2, 3));
        char direction = input3.charAt(4);
        char temp = direction;
        for (int i = 0; i < input4.length(); i++) {
            if (temp == 'N' && input4.charAt(i) == 'R' || temp == 'S' && input4.charAt(i) == 'L') {
                temp = 'E';
            } else if (temp == 'E' && input4.charAt(i) == 'R' || temp == 'W' && input4.charAt(i) == 'L') {
                temp = 'S';
            } else if (temp == 'S' && input4.charAt(i) == 'R' || temp == 'N' && input4.charAt(i) == 'L') {
                temp = 'W';
            } else if (temp == 'W' && input4.charAt(i) == 'R' || temp == 'E' && input4.charAt(i) == 'L') {
                temp = 'N';
            } else if (input4.charAt(i)=='M'){
                if(temp=='N'){
                    y++;
                    if(y>input2)
                        break;
                    y--;
                }
                else if(temp=='S'){
                    y--;
                    if(y<0)
                        break;
                    y++;
                } else if (temp == 'E') {
                    x++;
                    if(x>input1)
                        break;
                    x--;
                }
                else{
                    x--;
                    if(x<0)
                        break;
                    x++;
                }
            }
        }
        str = Integer.toString(x)+"-"+Integer.toString(y)+"-"+temp;
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test1 obj = new Test1();
        System.out.println(obj.moveRobot(sc.nextInt(),sc.nextInt(),sc.next(),sc.next()));
    }
}