package dev.androidagentskills.orbittasks.compose

import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [34])
class MainActivityScreenshotTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun orbitTasksBoard_matchesGolden() {
        composeRule.setContent { OrbitTasksApp() }
        composeRule.onRoot().captureRoboImage()
    }
}
