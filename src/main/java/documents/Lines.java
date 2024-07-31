package documents;

import java.util.Objects;

public class Lines {
    private Integer LineNo;
    private Integer Type;
    private String No;
    private Integer Quantity;
    private Double UnitPrice;

    public Lines(Integer lineNo, Integer type, String no, Integer quantity, Double unitPrice) {
        this.LineNo = lineNo;
        this.Type = type;
        this.No = no;
        this.Quantity = quantity;
        this.UnitPrice = unitPrice;
    }

    public Lines() {
    }

    public Integer getLineNo() {
        return LineNo;
    }

    public void setLineNo(Integer lineNo) {
        LineNo = lineNo;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        UnitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lines)) return false;
        Lines lines = (Lines) o;
        return Objects.equals(LineNo, lines.LineNo) && Objects.equals(Type, lines.Type) && Objects.equals(No, lines.No) && Objects.equals(Quantity, lines.Quantity) && Objects.equals(UnitPrice, lines.UnitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LineNo, Type, No, Quantity, UnitPrice);
    }

    @Override
    public String toString() {
        return "Lines{" +
                "LineNo=" + LineNo +
                ", Type=" + Type +
                ", No='" + No + '\'' +
                ", Quantity=" + Quantity +
                ", UnitPrice=" + UnitPrice +
                '}';
    }
}



