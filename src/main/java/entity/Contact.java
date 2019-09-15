package entity;

import java.time.LocalDateTime;
import java.util.Objects;
//** Класс в котором создается обьект Contact с полями для добавления в базу данных контактов*/
public class Contact {
    private int id;
    private String name;
    private String Lastname;
    private int age;
    private String phoneNumber;
    private boolean isMarried;
    private LocalDateTime createDate;
    private LocalDateTime updateTime;

    public Contact(){

    }

    public Contact(String name, String lastname, int age, String phoneNumber, boolean isMarried, LocalDateTime createDate, LocalDateTime updateTime) {
        this.name = name;
        Lastname = lastname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.isMarried = isMarried;
        this.createDate = createDate;
        this.updateTime = updateTime;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastName(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return age == contact.age &&
                isMarried == contact.isMarried &&
                Objects.equals(name, contact.name) &&
                Objects.equals(Lastname, contact.Lastname) &&
                Objects.equals(phoneNumber, contact.phoneNumber) &&
                Objects.equals(createDate, contact.createDate) &&
                Objects.equals(updateTime, contact.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Lastname, age, phoneNumber, isMarried, createDate, updateTime);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "ID  = " + id +
                ", Name = '" + name + '\'' +
                ", Last name = '" + Lastname + '\'' +
                ", Age = " + age +
                ", Phone number = '" + phoneNumber + '\'' +
                ", isMarried=" + isMarried +
                ", createDate=" + createDate +
                ", updateTime=" + updateTime +
                '}';
    }
}
