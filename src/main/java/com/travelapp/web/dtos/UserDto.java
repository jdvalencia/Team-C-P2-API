package com.travelapp.web.dtos;

import com.travelapp.models.Role;
import com.travelapp.models.Ticket;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

import static javax.persistence.CascadeType.ALL;

public class UserDto {

    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private List<Integer> tickets;

    public UserDto(int id, String username, String password, String firstName, String lastName, String email, String role, List<Integer> tickets) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public UserDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserDto setRole(String role) {
        this.role = role;
        return this;
    }

    public List<Integer> getTickets() {
        return tickets;
    }

    public UserDto setTickets(List<Integer> tickets) {
        this.tickets = tickets;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return id == userDto.id &&
                Objects.equals(username, userDto.username) &&
                Objects.equals(password, userDto.password) &&
                Objects.equals(firstName, userDto.firstName) &&
                Objects.equals(lastName, userDto.lastName) &&
                Objects.equals(email, userDto.email) &&
                Objects.equals(role, userDto.role) &&
                Objects.equals(tickets, userDto.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, email, role, tickets);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}

