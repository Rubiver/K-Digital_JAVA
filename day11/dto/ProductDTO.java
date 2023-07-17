package day11.dto;

import java.text.SimpleDateFormat;

public class ProductDTO {
    private String id;
    private String name;
    private int price;
    private long regDate;

    public ProductDTO() {
    }

    public ProductDTO(String id, String name, int price, long regDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.regDate = regDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegDate(long regDate) {
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public long getRegDate() {
        return regDate;
    }
    public String getDate()
    {
        long currentTime = this.regDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
        String result = sdf.format(currentTime);
        return result;
    }
}
