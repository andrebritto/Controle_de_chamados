package com.grokonez.springrest.postgresql.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
 
@Entity
class Customer(
		var name: String,
		var age: Int,
		var active: Int = 0,
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		val id: Long = -1) {
	
	private constructor() : this("", -1)
	
	override fun toString(): String{
		return "Customer [id= + ${this.id} + , name= + ${this.name} + , age= + ${this.age} + , active= + ${this.active} + ]";
	}
}