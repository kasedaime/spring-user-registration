package com.example.user.registration.registration.token;

import com.example.user.registration.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {

    @Id
    @SequenceGenerator(
            name = "token_sequence",
            sequenceName = "token_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "token_sequence"
    )
    private Long id;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime creationTime;

    @Column(nullable = false)
    private LocalDateTime expiresAt;

    private LocalDateTime confirmationTime;

    @ManyToOne
    @JoinColumn(
            nullable = false,
            name = "user_id"
    )
    private User user;

    public ConfirmationToken(String token, LocalDateTime creationTime,
                             LocalDateTime expiresAt, User user) {
        this.token = token;
        this.creationTime = creationTime;
        this.expiresAt = expiresAt;
        this.user = user;
    }
}
