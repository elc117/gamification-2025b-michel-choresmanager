package com.altmann.choresmanager.network.serializers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object ColorSerializer : KSerializer<Color> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Color", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: Color) {
        val hexString = "#" + value.toArgb().toUInt().toString(16).padStart(8, '0')
        encoder.encodeString(hexString)
    }

    override fun deserialize(decoder: Decoder): Color {
        val hexString = decoder.decodeString()
        return Color(hexString.removePrefix("#").toLong(16))
    }
}