package my.project.aplication.system.entity

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class Address {
    @Column(nullable = false) var zipCode: String = ""
    @Column(nullable = false) var street: String = ""
}
