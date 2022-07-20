package com.tutorial.demo.model

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "foo", schema = "tutorial")
data class FooEntity constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(name = "name")
    var name: String = "",

    @Column(name = "description")
    var description: String = "",

    @Column(name = "quantity")
    var quantitiy: Int = 0,

    @Column(name = "created_at")
    var createdAt: Date = Date(),

    @Column(name = "updated_at")
    var updatedAt: Date = Date(),

    @Column(name = "created_by")
    var createBy: String = "",

    @Column(name = "updated_by")
    var updatedBy: String = ""


)
