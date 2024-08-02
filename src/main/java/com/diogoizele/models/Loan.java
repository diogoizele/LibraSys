package main.java.com.diogoizele.models;

import java.time.LocalDate;
import java.util.Objects;

public class Loan {

    private Book book;
    private Member member;
    private LocalDate date;
    private LocalDate returnDate;

    public Loan(Book book, Member member, LocalDate date, LocalDate returnDate) {
        this.book = book;
        this.member = member;
        this.date = date;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Objects.equals(book, loan.book) && Objects.equals(member, loan.member) && Objects.equals(date, loan.date) && Objects.equals(returnDate, loan.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, member, date, returnDate);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "book=" + book +
                ", member=" + member +
                ", date=" + date +
                ", returnDate=" + returnDate +
                '}';
    }
}
