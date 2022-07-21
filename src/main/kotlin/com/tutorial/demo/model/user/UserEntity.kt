package com.tutorial.demo.model.user

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(schema = "tutorial", name = "user")
data class UserEntity constructor(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    @Column(name = "user_name")
    var userName: String = "",
    @Column(name = "email")
    var email: String = "",
    @Column(name = "password")
    var password: String = "",
    @Column(name = "is_activated")
    var isActivated: Boolean = false
)