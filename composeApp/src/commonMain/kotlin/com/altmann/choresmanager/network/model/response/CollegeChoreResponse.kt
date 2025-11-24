package api.model.response

import androidx.compose.ui.graphics.Color
import com.altmann.choresmanager.models.chores.Priority
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("COLLEGE")
data class CollegeChoreResponse(
    override val choreId: Int,
    @Contextual
    override val startTime: LocalTime,
    @Contextual
    override val endTime: LocalTime,
    override val daysOfWeek: List<DayOfWeek>,
    @Contextual
    override val startDate: LocalDate,
    @Contextual
    override val endDate: LocalDate,
    override var choreException: List<@Contextual LocalDate> = emptyList(),
    override val title: String,
    override val description: String?,
    override var priority: Priority,
    override val deleted: Boolean? = false,
    override var finished: Boolean = false,
    @Contextual
    override val finishedDate: LocalDate?,
    @Contextual
    override val color: Color,
    override val userId: Int,

    val subject : String,
    val location: String?,
    val professor: String?,
    val totalHours: Int?,
    val failed: Boolean,
    val absencesAllowed: Int,
    val absencesCurrent: Int

) : ChoreResponseBase
