package api.model.response

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.chores.Priority
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
sealed interface ChoreResponseBase {
    val choreId: Int
    @Contextual
    val startTime: LocalTime
    @Contextual
    val endTime: LocalTime
    val daysOfWeek: List<DayOfWeek>
    @Contextual
    val startDate: LocalDate
    @Contextual
    val endDate: LocalDate
    var choreException: List<@Contextual LocalDate>
    val title: String
    val description: String?
    var priority: Priority
    val deleted: Boolean?
    var finished: Boolean
    @Contextual
    val finishedDate: LocalDate?
    @Contextual
    val color: Color
    val userId: Int
}
