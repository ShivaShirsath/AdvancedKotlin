package src

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val parent = FrameDemo("Parent Frame")
        parent.isVisible = true
    }
}