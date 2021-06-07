package src

import java.awt.Frame
import java.awt.GraphicsEnvironment
import java.awt.event.WindowEvent
import java.awt.event.WindowListener

class FrameDemo internal constructor(name: String) : Frame() {
    init {
        setTitle(name)
        setSize(200, 100)
        addWindowListener(object : WindowListener {
            override fun windowOpened(windowEvent: WindowEvent) {
                println("$name Opened.")
            }
            override fun windowClosing(windowEvent: WindowEvent) {
                println("$name Closing...")
                dispose()
            }
            override fun windowClosed(windowEvent: WindowEvent) {
                println("$name Closed.")
            }
            override fun windowIconified(windowEvent: WindowEvent) {
                println("$name Iconified.")
            }
            override fun windowDeiconified(windowEvent: WindowEvent) {
                println("$name Deiconified.")
            }
            override fun windowActivated(windowEvent: WindowEvent) {
                println("$name Activated.")
            }
            override fun windowDeactivated(windowEvent: WindowEvent) {
                println("$name Deactivated.")
            }
        })
        setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().centerPoint.x - size.width / 2, GraphicsEnvironment.getLocalGraphicsEnvironment().centerPoint.y - size.height / 2)
    }
}