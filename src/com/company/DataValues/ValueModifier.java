package com.company.DataValues;

public class ValueModifier {
    private int modifierValue;
    private String reason; //Ex. Race, class, ...

    public ValueModifier(int modifierValue, String reason)
    {
        this.modifierValue = modifierValue;
        this.reason = reason;
    }

    public int getModifierValue() {
        return modifierValue;
    }
    public void setModifierValue(int modifierValue) {
        this.modifierValue = modifierValue;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}
