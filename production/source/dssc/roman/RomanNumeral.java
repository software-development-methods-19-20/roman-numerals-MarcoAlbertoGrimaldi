package dssc.roman;

public class RomanNumeral {
    private  int decimal;
    public RomanNumeral(int decimal){
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        if(decimal == 0) return "";

        addSomeM(res);

        if(decimal/100 == 9) res.append("CM");
        else if(decimal/100 == 4) res.append("CD");
        else {
            if(decimal/500 == 0) {
                addSomeC(res);
            } else {
                res.append("D");
                addSomeC(res);
            }
        }

        if(decimal/10 == 9) res.append("XC");
        else if(decimal/10 == 4) res.append("XL");
        else {
            if(decimal/50 == 0) {
                addSomeX(res);
            } else {
                res.append("L");
                addSomeX(res);
            }
        }

        if(decimal%9 == 0) res.append("IX");
        else if(decimal%10 == 4) res.append("IV");
        else {
            if(decimal%10/5 == 0) {
                addSomeI(res);
            } else {
                res.append("V");
                addSomeI(res);
            }
        }
        return res.toString();
    }

    private void addSomeI(StringBuilder res) {
        res.append("I".repeat(Math.min(3, decimal%5)));
    }

    private void addSomeX(StringBuilder res) {
        res.append("X".repeat(Math.min(3, decimal/10%5)));
    }

    private void addSomeC(StringBuilder res) {
        res.append("C".repeat(Math.min(3, decimal/100%5)));
    }

    private void addSomeM(StringBuilder res) {
        res.append("M".repeat(decimal/1000));
    }
}
