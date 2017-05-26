package com.objectcomputing


import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class Customer {

    String firstName
    String lastName

    static hasMany = [orders: Order]

}