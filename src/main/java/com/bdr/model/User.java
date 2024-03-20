package com.bdr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Comparable<User> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	private String userName;
	private String userAddress;
	private Long userNumber;
	private boolean userStatus;


	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userAddress='" + userAddress + '\'' +
				", userNumber=" + userNumber +
				", userStatus=" + userStatus +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return userStatus == user.userStatus && userId.equals(user.userId) && userName.equals(user.userName) && userAddress.equals(user.userAddress) && userNumber.equals(user.userNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, userName, userAddress, userNumber, userStatus);
	}

	public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
	@Override
	public int compareTo(User other) {
		return this.userName.compareTo(other.userName);
	}
}
