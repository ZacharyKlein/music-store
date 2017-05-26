package com.objectcomputing


import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class Order {
    String number

    static belongsTo = [customer: Customer]
    static hasMany = [instruments: Instrument]
}