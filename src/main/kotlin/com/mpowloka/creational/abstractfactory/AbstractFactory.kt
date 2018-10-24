package com.mpowloka.creational.abstractfactory

import com.mpowloka.creational.abstractfactory.breathing.Gills
import com.mpowloka.creational.abstractfactory.breathing.Lungs
import com.mpowloka.creational.abstractfactory.seeing.Eyes
import com.mpowloka.creational.abstractfactory.seeing.Sonar

class AbstractFactory(
        private val environment: Environment
) {

    fun getBreathingEquipment() = when (environment) {
        Environment.SEA -> Gills()
        Environment.LAND -> Lungs()
    }

    fun getSeeingEquipment() = when (environment) {
        Environment.SEA -> Sonar()
        Environment.LAND -> Eyes()
    }

}