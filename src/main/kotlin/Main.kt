fun main() {

    // Residential customer function
    fun getCustomerInfo(name: String, phone: String) {
        println("Name: $name\nPhone: $phone")
    }


    // Business customer function
    fun getCustomerInfo(businessName: String, contactName: String, phone: String) {
        println("Business name: $businessName\nContact name: $contactName\nPhone: $phone")
    }


    while (true) {

        // Menu
        println("Enter the number of your selection:\n")
        println("1) Residential Customer")
        println("2) Business Customer")


        // Collecting needed data to call function
        when (readLine()!!.toInt()) {

            !in 1..2 -> {
                println("Choice out of range")
                continue
            }
            1 -> {
                println("Enter name:  ")
                val name = readLine()!!.toString()

                println("Enter phone:  ")
                val phone = readLine()!!.toString()

                getCustomerInfo(name, phone)
                break

            }
            2 -> {

                println("Enter business name:  ")
                val businessName = readLine()!!.toString()

                println("Enter contact name:  ")
                val contactName = readLine()!!.toString()

                println("Enter phone:  ")
                val phone = readLine()!!.toString()

                getCustomerInfo(businessName, contactName, phone)
                break

            }
            else -> println("Unknown choice")


        }

    }

}

