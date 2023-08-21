package org.example.domain;
//this is insert record Application
public class JDBCInsert {
    private int insertId;
    private String titel;
    private String descripction;
    private int duration;
    private String status;

    public int getInsertId() {
        return insertId;
    }

    public void setInsertId(int insertId) {
        this.insertId = insertId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescripction() {
        return descripction;
    }

    public void setDescripction(String descripction) {
        this.descripction = descripction;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public JDBCInsert(int insertId, String titel, String descripction, int duration, String status) {
        this.insertId = insertId;
        this.titel = titel;
        this.descripction = descripction;
        this.duration = duration;
        this.status = status;
    }

    public JDBCInsert() {
    }

    @Override
    public String toString() {
        return "JDBCInsert{" +
                "insertId=" + insertId +
                ", titel='" + titel + '\'' +
                ", descripction='" + descripction + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;



    }
}
