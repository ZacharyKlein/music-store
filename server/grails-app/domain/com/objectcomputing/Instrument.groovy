package com.objectcomputing


import grails.rest.*

@Resource(readOnly = false, formats = ['json'])
class Instrument {

    String name
    String type

}