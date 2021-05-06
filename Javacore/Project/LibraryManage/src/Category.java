public enum Category {
    REFERENCE("Sach tham khao"), LITERATURE("Sach van hoc"), COMIC("Truyen tranh"), LANGUAGE("Sach ngoai ngu"),
    ECONOMIC("Sach kinh te");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
}
