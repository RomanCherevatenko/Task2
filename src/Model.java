public class Model {

    public int AimValue;
    public int attempt;
    public int rangeLow;
    public int rangeTop;

    public void SetAimValue(int aimValue) {
        this.AimValue = aimValue;
    }

    public int GetAimValue(){
        return AimValue;
    }

    public void setRange(int rangeLow, int rangeTop) {
        this.rangeLow = rangeLow;
        this.rangeTop = rangeTop;
    }

    public int  GetRangeLow() {
        return rangeLow;
    }

    public int GetRangeTop(){
        return rangeTop;
    }

    public void AddAttampt(){
        attempt++;

    }

    public int GetAttampt() {
        return attempt;
    }

    public int generateValue() {
        return (int) Math.ceil(Math.random() * (Consts.RANGE_TOP - Consts.RANGE_LOW - 1) + Consts.RANGE_LOW);
    }

    public  boolean checkForAttampt(int value) {
        AddAttampt();

        if ((value < AimValue)) {
            rangeLow = value;
        } else if (value > AimValue) {
            rangeTop = value;
        } else {
            return false;
        }
        return true;
    }
}
