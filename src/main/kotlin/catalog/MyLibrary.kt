package catalog

data class Language(val name: String, val hotness: Int)

class MyLibrary {
    companion object {
        private const val TOP_HOTNESS_RANK = 10
    }

    /**
     * @return data relating to the Kotlin {@code Language}.
     */
    fun kotlinLanguage() = Language("Kotlin", TOP_HOTNESS_RANK)
}
