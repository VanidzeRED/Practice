package ru.ssau.tk.pomelnikov.newtestproject.CollectionsTask;

public class Settlement extends Location {

    private int settlement;
    private SettlementType type;

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public int getSettlement() {
        return settlement;
    }

    public SettlementType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Settlement. Type: " + type +
                "; name: " + getName() +
                "; latitude: " + getLatitude() +
                "; longitude: " + getLongitude();
    }
}
