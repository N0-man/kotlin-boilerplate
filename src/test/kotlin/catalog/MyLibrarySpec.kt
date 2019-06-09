package catalog

import org.amshove.kluent.shouldEqual
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object MyLibrarySpec: Spek({
    Feature("Kotin") {
        Scenario("Test My Library Language") {
            val myLibrary = MyLibrary()
            Given("library instance") {
                // assume(set.isEmpty())
            }

//            When("do something") {
//                do something
//            }

            Then("it should be Kotlin") {
                "Kotlin" shouldEqual myLibrary.kotlinLanguage().name
            }

            Then("it should be hot") {
                10 shouldEqual myLibrary.kotlinLanguage().hotness
            }
        }
    }
})