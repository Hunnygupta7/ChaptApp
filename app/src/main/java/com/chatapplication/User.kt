//A user model is the collection and categorization of personal data associated with a specific user
package com.chatapplication

import java.io.StringReader

class User {

    var name: String? = null
    var email: String? = null
    var uid: String? = null //uid = Unique ID

    constructor(){}

    constructor(name: String?, email: String?, uid: String?) {
        this.name = name
        this.email = email
        this.uid = uid
    }



}