package com.example.projectvsga

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListCountryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_country)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listCountry = findViewById<ListView>(R.id.listCountry)
        val countries = arrayOf( "Afghanistan - Kabul",
            "Albania - Tirana",
            "Algeria - Algiers",
            "Andorra - Andorra la Vella",
            "Angola - Luanda",
            "Antigua and Barbuda - Saint John's",
            "Argentina - Buenos Aires",
            "Armenia - Yerevan",
            "Australia - Canberra",
            "Austria - Vienna",
            "Azerbaijan - Baku",
            "Bahamas - Nassau",
            "Bahrain - Manama",
            "Bangladesh - Dhaka",
            "Barbados - Bridgetown",
            "Belarus - Minsk",
            "Belgium - Brussels",
            "Belize - Belmopan",
            "Benin - Porto-Novo",
            "Bhutan - Thimphu",
            "Bolivia - Sucre",
            "Bosnia and Herzegovina - Sarajevo",
            "Botswana - Gaborone",
            "Brazil - Brasília",
            "Brunei - Bandar Seri Begawan",
            "Bulgaria - Sofia",
            "Burkina Faso - Ouagadougou",
            "Burundi - Gitega",
            "Cabo Verde - Praia",
            "Cambodia - Phnom Penh",
            "Cameroon - Yaoundé",
            "Canada - Ottawa",
            "Central African Republic - Bangui",
            "Chad - N'Djamena",
            "Chile - Santiago",
            "China - Beijing",
            "Colombia - Bogotá",
            "Comoros - Moroni",
            "Congo, Democratic Republic of the - Kinshasa",
            "Congo, Republic of the - Brazzaville",
            "Costa Rica - San José",
            "Croatia - Zagreb",
            "Cuba - Havana",
            "Cyprus - Nicosia",
            "Czech Republic - Prague",
            "Denmark - Copenhagen",
            "Djibouti - Djibouti",
            "Dominica - Roseau",
            "Dominican Republic - Santo Domingo"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        listCountry.adapter = adapter
    }
}