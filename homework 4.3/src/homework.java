import java.util.*;

class MyExcepiton extends Exception {
    public MyExcepiton(String msg) {
        super(msg);
    }

}

public class homework {
    public static void main(String[] args) {
        Double z ;
        Scanner in = new Scanner(System.in);
        System.out.println("数字运算符数字");
        String temp1 = in.nextLine();
        try {
            z = round(reception(temp1));
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static double reception(String temp) throws Exception {
        String c[] = null;
        int position1 = temp.indexOf("+");
        int position2 = temp.indexOf("-");
        int position3 = temp.indexOf("*");
        int position4 = temp.indexOf("/");

        if (position1 != -1) {
            c = temp.split("\\+");
            try {
                double x = Double.parseDouble(c[0]);
                double y = Double.parseDouble(c[1]);
                return (x + y);
            } catch (Exception e1) {
                throw new MyExcepiton("异常：非法的数字输入");
            }
        } else if (position2 != -1) {
            c = temp.split("\\-");
            try {
                double x = Double.parseDouble(c[0]);
                double y = Double.parseDouble(c[1]);
                return (x - y);
            } catch (Exception e1) {
                throw new MyExcepiton("异常：非法的数字输入");
            }
        } else if (position3 != -1) {
            c = temp.split("\\*");
            try {
                double x = Double.parseDouble(c[0]);
                double y = Double.parseDouble(c[1]);
                return (x * y);
            } catch (Exception e1) {
                throw new MyExcepiton("异常：非法的数字输入");
            }
        } else if (position4 != -1) {
            c = temp.split("\\/");
            try {
                double x = Double.parseDouble(c[0]);
                double y = Double.parseDouble(c[1]);
                return (x / y);
            } catch (Exception e1) {
                throw new MyExcepiton("异常：非法的数字输入");
            }
        } else {
            throw new MyExcepiton("异常：没有加减乘除四种运算符中的任何一种");
        }
    }

    public static double round(double num){
        return Math.round(num*Math.pow(10.0,3))/Math.pow(10.0,3);
    }

}



