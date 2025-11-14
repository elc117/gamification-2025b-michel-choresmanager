package com.altmann.choresmanager.res.myiconpack

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.res.MyIconPack

public val MyIconPack.Created25Achievement: ImageVector
    get() {
        if (_created25Achievement != null) {
            return _created25Achievement!!
        }
        _created25Achievement = Builder(name = "Created25Achievement", defaultWidth = 238.0.dp,
                defaultHeight = 238.0.dp, viewportWidth = 238.0f, viewportHeight = 238.0f).apply {
            path(fill = SolidColor(Color(0xFF1E1E1E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(238.0f)
                verticalLineToRelative(238.0f)
                horizontalLineToRelative(-238.0f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF096972)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(238.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(238.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1BB7C5), 1.0f to Color(0xFF0D093F),
                        start = Offset(119.0f,-125.2f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -125.2f)
                    curveTo(6.33f, -123.03f, 25.97f, -118.49f, 37.97f, -112.17f)
                    curveTo(49.96f, -105.84f, 61.96f, -92.9f, 71.97f, -87.23f)
                    curveTo(81.98f, -81.56f, 88.02f, -82.51f, 98.03f, -78.16f)
                    curveTo(108.04f, -73.82f, 119.38f, -68.15f, 132.03f, -61.16f)
                    curveTo(144.69f, -54.18f, 161.31f, -41.9f, 173.97f, -36.23f)
                    curveTo(186.62f, -30.56f, 197.29f, -32.17f, 207.97f, -27.16f)
                    curveTo(218.64f, -22.16f, 232.99f, -9.69f, 238.0f, -6.2f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-125.2f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1BB7C5), 1.0f to Color(0xFF0D093F),
                        start = Offset(119.0f,-59.11f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -59.11f)
                    curveTo(5.01f, -55.3f, 19.36f, -43.21f, 30.03f, -36.25f)
                    curveTo(40.71f, -29.3f, 52.7f, -22.34f, 64.03f, -17.36f)
                    curveTo(75.37f, -12.39f, 85.38f, -11.38f, 98.03f, -6.4f)
                    curveTo(110.69f, -1.43f, 128.63f, 6.19f, 139.97f, 12.49f)
                    curveTo(151.3f, 18.79f, 154.7f, 23.76f, 166.03f, 31.38f)
                    curveTo(177.37f, 39.0f, 195.97f, 51.25f, 207.97f, 58.21f)
                    curveTo(219.96f, 65.17f, 232.99f, 70.65f, 238.0f, 73.14f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-59.11f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1BB7C5), 1.0f to Color(0xFF0D093F),
                        start = Offset(119.0f,19.37f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, 19.37f)
                    curveTo(5.95f, 22.75f, 21.82f, 32.23f, 35.7f, 39.65f)
                    curveTo(49.58f, 47.07f, 70.08f, 55.82f, 83.3f, 63.9f)
                    curveTo(96.52f, 71.98f, 103.13f, 80.07f, 115.03f, 88.15f)
                    curveTo(126.93f, 96.23f, 141.48f, 102.99f, 154.7f, 112.4f)
                    curveTo(167.92f, 121.8f, 180.48f, 135.84f, 194.37f, 144.58f)
                    curveTo(208.25f, 153.33f, 230.73f, 161.48f, 238.0f, 164.87f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.37f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xA0FFFFFF), 1.0f to Color(0x38FFFFFF),
                        start = Offset(119.0f,182.0f), end = Offset(119.0f,219.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(23.0f, 182.0f)
                    lineTo(215.0f, 182.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 223.0f, 190.0f)
                    lineTo(223.0f, 211.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 215.0f, 219.0f)
                    lineTo(23.0f, 219.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 211.0f)
                    lineTo(15.0f, 190.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 23.0f, 182.0f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(42.16f, 197.87f)
                    horizontalLineTo(37.9f)
                    curveTo(37.85f, 197.43f, 37.73f, 197.04f, 37.55f, 196.68f)
                    curveTo(37.38f, 196.33f, 37.14f, 196.03f, 36.86f, 195.78f)
                    curveTo(36.57f, 195.53f, 36.22f, 195.34f, 35.82f, 195.21f)
                    curveTo(35.43f, 195.07f, 35.0f, 195.01f, 34.52f, 195.01f)
                    curveTo(33.67f, 195.01f, 32.94f, 195.21f, 32.33f, 195.63f)
                    curveTo(31.72f, 196.04f, 31.25f, 196.64f, 30.92f, 197.43f)
                    curveTo(30.6f, 198.21f, 30.44f, 199.16f, 30.44f, 200.27f)
                    curveTo(30.44f, 201.43f, 30.6f, 202.4f, 30.93f, 203.19f)
                    curveTo(31.27f, 203.97f, 31.74f, 204.55f, 32.34f, 204.95f)
                    curveTo(32.95f, 205.34f, 33.66f, 205.54f, 34.49f, 205.54f)
                    curveTo(34.96f, 205.54f, 35.38f, 205.48f, 35.76f, 205.36f)
                    curveTo(36.15f, 205.24f, 36.49f, 205.07f, 36.78f, 204.84f)
                    curveTo(37.07f, 204.61f, 37.32f, 204.33f, 37.5f, 204.0f)
                    curveTo(37.7f, 203.66f, 37.83f, 203.28f, 37.9f, 202.86f)
                    lineTo(42.16f, 202.89f)
                    curveTo(42.09f, 203.66f, 41.87f, 204.42f, 41.49f, 205.17f)
                    curveTo(41.12f, 205.92f, 40.61f, 206.61f, 39.97f, 207.23f)
                    curveTo(39.32f, 207.84f, 38.53f, 208.33f, 37.6f, 208.69f)
                    curveTo(36.67f, 209.06f, 35.61f, 209.24f, 34.41f, 209.24f)
                    curveTo(32.83f, 209.24f, 31.41f, 208.89f, 30.16f, 208.2f)
                    curveTo(28.92f, 207.5f, 27.94f, 206.48f, 27.22f, 205.15f)
                    curveTo(26.49f, 203.81f, 26.13f, 202.19f, 26.13f, 200.27f)
                    curveTo(26.13f, 198.35f, 26.5f, 196.72f, 27.23f, 195.39f)
                    curveTo(27.97f, 194.05f, 28.96f, 193.04f, 30.21f, 192.35f)
                    curveTo(31.46f, 191.65f, 32.86f, 191.31f, 34.41f, 191.31f)
                    curveTo(35.47f, 191.31f, 36.44f, 191.46f, 37.34f, 191.75f)
                    curveTo(38.24f, 192.04f, 39.03f, 192.47f, 39.71f, 193.03f)
                    curveTo(40.39f, 193.59f, 40.95f, 194.27f, 41.37f, 195.08f)
                    curveTo(41.8f, 195.9f, 42.06f, 196.82f, 42.16f, 197.87f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(44.58f, 209.0f)
                    verticalLineTo(195.91f)
                    horizontalLineTo(48.63f)
                    verticalLineTo(198.3f)
                    horizontalLineTo(48.76f)
                    curveTo(49.0f, 197.43f, 49.39f, 196.79f, 49.93f, 196.37f)
                    curveTo(50.47f, 195.94f, 51.1f, 195.73f, 51.81f, 195.73f)
                    curveTo(52.01f, 195.73f, 52.21f, 195.74f, 52.41f, 195.77f)
                    curveTo(52.62f, 195.8f, 52.81f, 195.83f, 52.98f, 195.88f)
                    verticalLineTo(199.51f)
                    curveTo(52.78f, 199.44f, 52.52f, 199.38f, 52.2f, 199.34f)
                    curveTo(51.88f, 199.3f, 51.6f, 199.28f, 51.35f, 199.28f)
                    curveTo(50.85f, 199.28f, 50.41f, 199.4f, 50.01f, 199.62f)
                    curveTo(49.62f, 199.83f, 49.31f, 200.14f, 49.08f, 200.53f)
                    curveTo(48.86f, 200.91f, 48.75f, 201.37f, 48.75f, 201.89f)
                    verticalLineTo(209.0f)
                    horizontalLineTo(44.58f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(60.12f, 209.25f)
                    curveTo(58.75f, 209.25f, 57.57f, 208.98f, 56.57f, 208.44f)
                    curveTo(55.59f, 207.89f, 54.82f, 207.12f, 54.29f, 206.11f)
                    curveTo(53.76f, 205.1f, 53.5f, 203.9f, 53.5f, 202.51f)
                    curveTo(53.5f, 201.15f, 53.76f, 199.97f, 54.3f, 198.96f)
                    curveTo(54.83f, 197.94f, 55.59f, 197.15f, 56.56f, 196.59f)
                    curveTo(57.53f, 196.02f, 58.67f, 195.74f, 59.99f, 195.74f)
                    curveTo(60.92f, 195.74f, 61.78f, 195.88f, 62.55f, 196.17f)
                    curveTo(63.32f, 196.46f, 63.99f, 196.89f, 64.55f, 197.46f)
                    curveTo(65.11f, 198.03f, 65.55f, 198.73f, 65.86f, 199.57f)
                    curveTo(66.18f, 200.4f, 66.33f, 201.35f, 66.33f, 202.42f)
                    verticalLineTo(203.46f)
                    horizontalLineTo(54.96f)
                    verticalLineTo(201.04f)
                    horizontalLineTo(62.46f)
                    curveTo(62.45f, 200.6f, 62.34f, 200.2f, 62.14f, 199.85f)
                    curveTo(61.94f, 199.51f, 61.65f, 199.24f, 61.3f, 199.05f)
                    curveTo(60.94f, 198.85f, 60.54f, 198.75f, 60.08f, 198.75f)
                    curveTo(59.61f, 198.75f, 59.19f, 198.85f, 58.82f, 199.06f)
                    curveTo(58.46f, 199.27f, 58.16f, 199.55f, 57.95f, 199.91f)
                    curveTo(57.73f, 200.26f, 57.62f, 200.66f, 57.61f, 201.11f)
                    verticalLineTo(203.57f)
                    curveTo(57.61f, 204.1f, 57.71f, 204.57f, 57.92f, 204.98f)
                    curveTo(58.13f, 205.38f, 58.43f, 205.68f, 58.82f, 205.91f)
                    curveTo(59.2f, 206.13f, 59.66f, 206.24f, 60.2f, 206.24f)
                    curveTo(60.57f, 206.24f, 60.9f, 206.19f, 61.2f, 206.09f)
                    curveTo(61.5f, 205.98f, 61.76f, 205.83f, 61.98f, 205.63f)
                    curveTo(62.19f, 205.43f, 62.36f, 205.19f, 62.46f, 204.9f)
                    lineTo(66.29f, 205.01f)
                    curveTo(66.13f, 205.87f, 65.78f, 206.62f, 65.24f, 207.25f)
                    curveTo(64.71f, 207.88f, 64.01f, 208.38f, 63.14f, 208.73f)
                    curveTo(62.27f, 209.07f, 61.26f, 209.25f, 60.12f, 209.25f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(72.15f, 209.22f)
                    curveTo(71.32f, 209.22f, 70.58f, 209.08f, 69.93f, 208.8f)
                    curveTo(69.29f, 208.52f, 68.78f, 208.09f, 68.4f, 207.53f)
                    curveTo(68.03f, 206.95f, 67.85f, 206.23f, 67.85f, 205.37f)
                    curveTo(67.85f, 204.64f, 67.98f, 204.03f, 68.23f, 203.53f)
                    curveTo(68.49f, 203.03f, 68.84f, 202.62f, 69.29f, 202.31f)
                    curveTo(69.74f, 202.0f, 70.25f, 201.76f, 70.84f, 201.6f)
                    curveTo(71.42f, 201.44f, 72.05f, 201.33f, 72.71f, 201.27f)
                    curveTo(73.46f, 201.2f, 74.06f, 201.13f, 74.51f, 201.06f)
                    curveTo(74.97f, 200.98f, 75.3f, 200.87f, 75.5f, 200.72f)
                    curveTo(75.71f, 200.58f, 75.82f, 200.37f, 75.82f, 200.1f)
                    verticalLineTo(200.06f)
                    curveTo(75.82f, 199.62f, 75.67f, 199.28f, 75.37f, 199.05f)
                    curveTo(75.06f, 198.81f, 74.66f, 198.69f, 74.15f, 198.69f)
                    curveTo(73.6f, 198.69f, 73.15f, 198.81f, 72.82f, 199.05f)
                    curveTo(72.48f, 199.28f, 72.27f, 199.61f, 72.18f, 200.03f)
                    lineTo(68.33f, 199.9f)
                    curveTo(68.45f, 199.1f, 68.74f, 198.39f, 69.21f, 197.77f)
                    curveTo(69.69f, 197.14f, 70.34f, 196.64f, 71.17f, 196.28f)
                    curveTo(72.01f, 195.92f, 73.01f, 195.74f, 74.18f, 195.74f)
                    curveTo(75.02f, 195.74f, 75.79f, 195.84f, 76.49f, 196.04f)
                    curveTo(77.19f, 196.23f, 77.81f, 196.51f, 78.33f, 196.89f)
                    curveTo(78.85f, 197.26f, 79.26f, 197.71f, 79.54f, 198.25f)
                    curveTo(79.83f, 198.79f, 79.98f, 199.41f, 79.98f, 200.1f)
                    verticalLineTo(209.0f)
                    horizontalLineTo(76.06f)
                    verticalLineTo(207.18f)
                    horizontalLineTo(75.95f)
                    curveTo(75.72f, 207.62f, 75.42f, 207.99f, 75.06f, 208.3f)
                    curveTo(74.7f, 208.61f, 74.28f, 208.84f, 73.79f, 208.99f)
                    curveTo(73.31f, 209.15f, 72.76f, 209.22f, 72.15f, 209.22f)
                    close()
                    moveTo(73.44f, 206.49f)
                    curveTo(73.89f, 206.49f, 74.29f, 206.4f, 74.65f, 206.22f)
                    curveTo(75.01f, 206.04f, 75.3f, 205.79f, 75.52f, 205.47f)
                    curveTo(75.73f, 205.15f, 75.84f, 204.77f, 75.84f, 204.35f)
                    verticalLineTo(203.1f)
                    curveTo(75.72f, 203.16f, 75.58f, 203.22f, 75.41f, 203.27f)
                    curveTo(75.24f, 203.32f, 75.06f, 203.37f, 74.86f, 203.42f)
                    curveTo(74.66f, 203.46f, 74.46f, 203.5f, 74.25f, 203.54f)
                    curveTo(74.04f, 203.57f, 73.84f, 203.6f, 73.64f, 203.63f)
                    curveTo(73.25f, 203.69f, 72.92f, 203.79f, 72.64f, 203.92f)
                    curveTo(72.37f, 204.05f, 72.15f, 204.22f, 72.01f, 204.43f)
                    curveTo(71.87f, 204.64f, 71.79f, 204.88f, 71.79f, 205.16f)
                    curveTo(71.79f, 205.6f, 71.95f, 205.93f, 72.25f, 206.15f)
                    curveTo(72.57f, 206.38f, 72.96f, 206.49f, 73.44f, 206.49f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(89.91f, 195.91f)
                    verticalLineTo(198.98f)
                    horizontalLineTo(81.65f)
                    verticalLineTo(195.91f)
                    horizontalLineTo(89.91f)
                    close()
                    moveTo(83.39f, 192.77f)
                    horizontalLineTo(87.55f)
                    verticalLineTo(204.88f)
                    curveTo(87.55f, 205.14f, 87.59f, 205.35f, 87.67f, 205.51f)
                    curveTo(87.76f, 205.66f, 87.88f, 205.77f, 88.04f, 205.84f)
                    curveTo(88.2f, 205.9f, 88.39f, 205.93f, 88.61f, 205.93f)
                    curveTo(88.77f, 205.93f, 88.94f, 205.92f, 89.11f, 205.89f)
                    curveTo(89.29f, 205.85f, 89.43f, 205.83f, 89.52f, 205.8f)
                    lineTo(90.15f, 208.81f)
                    curveTo(89.95f, 208.87f, 89.67f, 208.94f, 89.31f, 209.03f)
                    curveTo(88.95f, 209.11f, 88.52f, 209.16f, 88.02f, 209.19f)
                    curveTo(87.04f, 209.23f, 86.21f, 209.12f, 85.51f, 208.85f)
                    curveTo(84.81f, 208.57f, 84.28f, 208.14f, 83.91f, 207.55f)
                    curveTo(83.55f, 206.97f, 83.37f, 206.23f, 83.39f, 205.34f)
                    verticalLineTo(192.77f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(98.02f, 209.25f)
                    curveTo(96.65f, 209.25f, 95.47f, 208.98f, 94.47f, 208.44f)
                    curveTo(93.48f, 207.89f, 92.72f, 207.12f, 92.19f, 206.11f)
                    curveTo(91.66f, 205.1f, 91.4f, 203.9f, 91.4f, 202.51f)
                    curveTo(91.4f, 201.15f, 91.66f, 199.97f, 92.2f, 198.96f)
                    curveTo(92.73f, 197.94f, 93.48f, 197.15f, 94.46f, 196.59f)
                    curveTo(95.43f, 196.02f, 96.57f, 195.74f, 97.89f, 195.74f)
                    curveTo(98.82f, 195.74f, 99.67f, 195.88f, 100.45f, 196.17f)
                    curveTo(101.22f, 196.46f, 101.89f, 196.89f, 102.45f, 197.46f)
                    curveTo(103.01f, 198.03f, 103.45f, 198.73f, 103.76f, 199.57f)
                    curveTo(104.07f, 200.4f, 104.23f, 201.35f, 104.23f, 202.42f)
                    verticalLineTo(203.46f)
                    horizontalLineTo(92.85f)
                    verticalLineTo(201.04f)
                    horizontalLineTo(100.35f)
                    curveTo(100.35f, 200.6f, 100.24f, 200.2f, 100.04f, 199.85f)
                    curveTo(99.83f, 199.51f, 99.55f, 199.24f, 99.19f, 199.05f)
                    curveTo(98.84f, 198.85f, 98.44f, 198.75f, 97.98f, 198.75f)
                    curveTo(97.51f, 198.75f, 97.09f, 198.85f, 96.72f, 199.06f)
                    curveTo(96.35f, 199.27f, 96.06f, 199.55f, 95.85f, 199.91f)
                    curveTo(95.63f, 200.26f, 95.52f, 200.66f, 95.5f, 201.11f)
                    verticalLineTo(203.57f)
                    curveTo(95.5f, 204.1f, 95.61f, 204.57f, 95.82f, 204.98f)
                    curveTo(96.03f, 205.38f, 96.33f, 205.68f, 96.71f, 205.91f)
                    curveTo(97.1f, 206.13f, 97.56f, 206.24f, 98.1f, 206.24f)
                    curveTo(98.46f, 206.24f, 98.8f, 206.19f, 99.1f, 206.09f)
                    curveTo(99.4f, 205.98f, 99.66f, 205.83f, 99.88f, 205.63f)
                    curveTo(100.09f, 205.43f, 100.25f, 205.19f, 100.36f, 204.9f)
                    lineTo(104.19f, 205.01f)
                    curveTo(104.03f, 205.87f, 103.68f, 206.62f, 103.14f, 207.25f)
                    curveTo(102.61f, 207.88f, 101.9f, 208.38f, 101.04f, 208.73f)
                    curveTo(100.17f, 209.07f, 99.16f, 209.25f, 98.02f, 209.25f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(111.14f, 209.19f)
                    curveTo(110.18f, 209.19f, 109.3f, 208.94f, 108.51f, 208.44f)
                    curveTo(107.72f, 207.94f, 107.09f, 207.19f, 106.62f, 206.19f)
                    curveTo(106.14f, 205.19f, 105.91f, 203.95f, 105.91f, 202.46f)
                    curveTo(105.91f, 200.92f, 106.15f, 199.66f, 106.64f, 198.66f)
                    curveTo(107.13f, 197.67f, 107.77f, 196.93f, 108.56f, 196.46f)
                    curveTo(109.35f, 195.98f, 110.21f, 195.74f, 111.12f, 195.74f)
                    curveTo(111.81f, 195.74f, 112.4f, 195.86f, 112.89f, 196.1f)
                    curveTo(113.38f, 196.33f, 113.78f, 196.63f, 114.1f, 197.0f)
                    curveTo(114.42f, 197.37f, 114.66f, 197.75f, 114.82f, 198.15f)
                    horizontalLineTo(114.91f)
                    verticalLineTo(191.55f)
                    horizontalLineTo(119.08f)
                    verticalLineTo(209.0f)
                    horizontalLineTo(114.95f)
                    verticalLineTo(206.88f)
                    horizontalLineTo(114.82f)
                    curveTo(114.65f, 207.28f, 114.4f, 207.66f, 114.07f, 208.01f)
                    curveTo(113.75f, 208.36f, 113.34f, 208.65f, 112.85f, 208.86f)
                    curveTo(112.37f, 209.08f, 111.8f, 209.19f, 111.14f, 209.19f)
                    close()
                    moveTo(112.59f, 205.94f)
                    curveTo(113.1f, 205.94f, 113.53f, 205.8f, 113.89f, 205.51f)
                    curveTo(114.24f, 205.22f, 114.52f, 204.82f, 114.71f, 204.3f)
                    curveTo(114.91f, 203.77f, 115.0f, 203.16f, 115.0f, 202.46f)
                    curveTo(115.0f, 201.74f, 114.91f, 201.12f, 114.71f, 200.6f)
                    curveTo(114.53f, 200.09f, 114.25f, 199.69f, 113.89f, 199.41f)
                    curveTo(113.53f, 199.13f, 113.1f, 198.99f, 112.59f, 198.99f)
                    curveTo(112.07f, 198.99f, 111.64f, 199.14f, 111.28f, 199.42f)
                    curveTo(110.92f, 199.71f, 110.65f, 200.1f, 110.46f, 200.62f)
                    curveTo(110.28f, 201.14f, 110.19f, 201.75f, 110.19f, 202.46f)
                    curveTo(110.19f, 203.16f, 110.28f, 203.77f, 110.47f, 204.3f)
                    curveTo(110.66f, 204.82f, 110.93f, 205.22f, 111.28f, 205.51f)
                    curveTo(111.64f, 205.8f, 112.07f, 205.94f, 112.59f, 205.94f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(142.71f, 197.87f)
                    horizontalLineTo(138.45f)
                    curveTo(138.39f, 197.43f, 138.28f, 197.04f, 138.1f, 196.68f)
                    curveTo(137.93f, 196.33f, 137.69f, 196.03f, 137.4f, 195.78f)
                    curveTo(137.11f, 195.53f, 136.77f, 195.34f, 136.37f, 195.21f)
                    curveTo(135.98f, 195.07f, 135.54f, 195.01f, 135.07f, 195.01f)
                    curveTo(134.22f, 195.01f, 133.49f, 195.21f, 132.88f, 195.63f)
                    curveTo(132.27f, 196.04f, 131.8f, 196.64f, 131.47f, 197.43f)
                    curveTo(131.15f, 198.21f, 130.98f, 199.16f, 130.98f, 200.27f)
                    curveTo(130.98f, 201.43f, 131.15f, 202.4f, 131.48f, 203.19f)
                    curveTo(131.81f, 203.97f, 132.28f, 204.55f, 132.88f, 204.95f)
                    curveTo(133.49f, 205.34f, 134.21f, 205.54f, 135.04f, 205.54f)
                    curveTo(135.51f, 205.54f, 135.93f, 205.48f, 136.31f, 205.36f)
                    curveTo(136.7f, 205.24f, 137.04f, 205.07f, 137.32f, 204.84f)
                    curveTo(137.62f, 204.61f, 137.86f, 204.33f, 138.05f, 204.0f)
                    curveTo(138.24f, 203.66f, 138.38f, 203.28f, 138.45f, 202.86f)
                    lineTo(142.71f, 202.89f)
                    curveTo(142.64f, 203.66f, 142.41f, 204.42f, 142.04f, 205.17f)
                    curveTo(141.67f, 205.92f, 141.16f, 206.61f, 140.51f, 207.23f)
                    curveTo(139.87f, 207.84f, 139.07f, 208.33f, 138.14f, 208.69f)
                    curveTo(137.22f, 209.06f, 136.15f, 209.24f, 134.96f, 209.24f)
                    curveTo(133.38f, 209.24f, 131.96f, 208.89f, 130.71f, 208.2f)
                    curveTo(129.47f, 207.5f, 128.48f, 206.48f, 127.76f, 205.15f)
                    curveTo(127.04f, 203.81f, 126.68f, 202.19f, 126.68f, 200.27f)
                    curveTo(126.68f, 198.35f, 127.05f, 196.72f, 127.78f, 195.39f)
                    curveTo(128.51f, 194.05f, 129.5f, 193.04f, 130.75f, 192.35f)
                    curveTo(132.0f, 191.65f, 133.4f, 191.31f, 134.96f, 191.31f)
                    curveTo(136.01f, 191.31f, 136.99f, 191.46f, 137.89f, 191.75f)
                    curveTo(138.79f, 192.04f, 139.57f, 192.47f, 140.26f, 193.03f)
                    curveTo(140.94f, 193.59f, 141.49f, 194.27f, 141.92f, 195.08f)
                    curveTo(142.35f, 195.9f, 142.61f, 196.82f, 142.71f, 197.87f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(149.29f, 201.53f)
                    verticalLineTo(209.0f)
                    horizontalLineTo(145.13f)
                    verticalLineTo(191.55f)
                    horizontalLineTo(149.16f)
                    verticalLineTo(198.31f)
                    horizontalLineTo(149.3f)
                    curveTo(149.6f, 197.51f, 150.08f, 196.88f, 150.75f, 196.42f)
                    curveTo(151.43f, 195.97f, 152.25f, 195.74f, 153.23f, 195.74f)
                    curveTo(154.15f, 195.74f, 154.95f, 195.94f, 155.63f, 196.35f)
                    curveTo(156.32f, 196.76f, 156.84f, 197.33f, 157.22f, 198.07f)
                    curveTo(157.6f, 198.8f, 157.79f, 199.67f, 157.78f, 200.66f)
                    verticalLineTo(209.0f)
                    horizontalLineTo(153.61f)
                    verticalLineTo(201.47f)
                    curveTo(153.62f, 200.75f, 153.44f, 200.18f, 153.07f, 199.77f)
                    curveTo(152.7f, 199.36f, 152.18f, 199.16f, 151.51f, 199.16f)
                    curveTo(151.07f, 199.16f, 150.68f, 199.25f, 150.35f, 199.45f)
                    curveTo(150.02f, 199.63f, 149.76f, 199.9f, 149.57f, 200.26f)
                    curveTo(149.39f, 200.61f, 149.3f, 201.03f, 149.29f, 201.53f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(166.49f, 209.25f)
                    curveTo(165.12f, 209.25f, 163.94f, 208.97f, 162.95f, 208.4f)
                    curveTo(161.97f, 207.84f, 161.21f, 207.05f, 160.67f, 206.03f)
                    curveTo(160.15f, 205.02f, 159.88f, 203.84f, 159.88f, 202.5f)
                    curveTo(159.88f, 201.15f, 160.15f, 199.97f, 160.67f, 198.96f)
                    curveTo(161.21f, 197.94f, 161.97f, 197.15f, 162.95f, 196.59f)
                    curveTo(163.94f, 196.02f, 165.12f, 195.74f, 166.49f, 195.74f)
                    curveTo(167.87f, 195.74f, 169.05f, 196.02f, 170.03f, 196.59f)
                    curveTo(171.02f, 197.15f, 171.78f, 197.94f, 172.31f, 198.96f)
                    curveTo(172.84f, 199.97f, 173.11f, 201.15f, 173.11f, 202.5f)
                    curveTo(173.11f, 203.84f, 172.84f, 205.02f, 172.31f, 206.03f)
                    curveTo(171.78f, 207.05f, 171.02f, 207.84f, 170.03f, 208.4f)
                    curveTo(169.05f, 208.97f, 167.87f, 209.25f, 166.49f, 209.25f)
                    close()
                    moveTo(166.52f, 206.1f)
                    curveTo(167.02f, 206.1f, 167.44f, 205.95f, 167.79f, 205.64f)
                    curveTo(168.14f, 205.34f, 168.4f, 204.91f, 168.58f, 204.36f)
                    curveTo(168.77f, 203.82f, 168.86f, 203.19f, 168.86f, 202.47f)
                    curveTo(168.86f, 201.74f, 168.77f, 201.11f, 168.58f, 200.56f)
                    curveTo(168.4f, 200.02f, 168.14f, 199.59f, 167.79f, 199.28f)
                    curveTo(167.44f, 198.98f, 167.02f, 198.82f, 166.52f, 198.82f)
                    curveTo(166.0f, 198.82f, 165.57f, 198.98f, 165.21f, 199.28f)
                    curveTo(164.85f, 199.59f, 164.59f, 200.02f, 164.4f, 200.56f)
                    curveTo(164.22f, 201.11f, 164.13f, 201.74f, 164.13f, 202.47f)
                    curveTo(164.13f, 203.19f, 164.22f, 203.82f, 164.4f, 204.36f)
                    curveTo(164.59f, 204.91f, 164.85f, 205.34f, 165.21f, 205.64f)
                    curveTo(165.57f, 205.95f, 166.0f, 206.1f, 166.52f, 206.1f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(175.24f, 209.0f)
                    verticalLineTo(195.91f)
                    horizontalLineTo(179.29f)
                    verticalLineTo(198.3f)
                    horizontalLineTo(179.43f)
                    curveTo(179.67f, 197.43f, 180.05f, 196.79f, 180.6f, 196.37f)
                    curveTo(181.13f, 195.94f, 181.76f, 195.73f, 182.48f, 195.73f)
                    curveTo(182.67f, 195.73f, 182.87f, 195.74f, 183.07f, 195.77f)
                    curveTo(183.28f, 195.8f, 183.47f, 195.83f, 183.65f, 195.88f)
                    verticalLineTo(199.51f)
                    curveTo(183.45f, 199.44f, 183.19f, 199.38f, 182.86f, 199.34f)
                    curveTo(182.54f, 199.3f, 182.26f, 199.28f, 182.01f, 199.28f)
                    curveTo(181.52f, 199.28f, 181.07f, 199.4f, 180.67f, 199.62f)
                    curveTo(180.28f, 199.83f, 179.97f, 200.14f, 179.74f, 200.53f)
                    curveTo(179.52f, 200.91f, 179.41f, 201.37f, 179.41f, 201.89f)
                    verticalLineTo(209.0f)
                    horizontalLineTo(175.24f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(190.78f, 209.25f)
                    curveTo(189.41f, 209.25f, 188.23f, 208.98f, 187.24f, 208.44f)
                    curveTo(186.25f, 207.89f, 185.49f, 207.12f, 184.96f, 206.11f)
                    curveTo(184.43f, 205.1f, 184.16f, 203.9f, 184.16f, 202.51f)
                    curveTo(184.16f, 201.15f, 184.43f, 199.97f, 184.96f, 198.96f)
                    curveTo(185.5f, 197.94f, 186.25f, 197.15f, 187.22f, 196.59f)
                    curveTo(188.19f, 196.02f, 189.34f, 195.74f, 190.66f, 195.74f)
                    curveTo(191.59f, 195.74f, 192.44f, 195.88f, 193.21f, 196.17f)
                    curveTo(193.99f, 196.46f, 194.65f, 196.89f, 195.22f, 197.46f)
                    curveTo(195.78f, 198.03f, 196.22f, 198.73f, 196.53f, 199.57f)
                    curveTo(196.84f, 200.4f, 197.0f, 201.35f, 197.0f, 202.42f)
                    verticalLineTo(203.46f)
                    horizontalLineTo(185.62f)
                    verticalLineTo(201.04f)
                    horizontalLineTo(193.12f)
                    curveTo(193.11f, 200.6f, 193.01f, 200.2f, 192.8f, 199.85f)
                    curveTo(192.6f, 199.51f, 192.32f, 199.24f, 191.96f, 199.05f)
                    curveTo(191.61f, 198.85f, 191.2f, 198.75f, 190.74f, 198.75f)
                    curveTo(190.28f, 198.75f, 189.86f, 198.85f, 189.49f, 199.06f)
                    curveTo(189.12f, 199.27f, 188.83f, 199.55f, 188.61f, 199.91f)
                    curveTo(188.4f, 200.26f, 188.28f, 200.66f, 188.27f, 201.11f)
                    verticalLineTo(203.57f)
                    curveTo(188.27f, 204.1f, 188.38f, 204.57f, 188.59f, 204.98f)
                    curveTo(188.79f, 205.38f, 189.09f, 205.68f, 189.48f, 205.91f)
                    curveTo(189.87f, 206.13f, 190.33f, 206.24f, 190.86f, 206.24f)
                    curveTo(191.23f, 206.24f, 191.57f, 206.19f, 191.87f, 206.09f)
                    curveTo(192.17f, 205.98f, 192.43f, 205.83f, 192.64f, 205.63f)
                    curveTo(192.86f, 205.43f, 193.02f, 205.19f, 193.13f, 204.9f)
                    lineTo(196.96f, 205.01f)
                    curveTo(196.79f, 205.87f, 196.45f, 206.62f, 195.91f, 207.25f)
                    curveTo(195.37f, 207.88f, 194.67f, 208.38f, 193.8f, 208.73f)
                    curveTo(192.93f, 209.07f, 191.93f, 209.25f, 190.78f, 209.25f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.51f,209.25f), end = Offset(118.51f,191.31f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(210.55f, 199.91f)
                    lineTo(206.73f, 200.01f)
                    curveTo(206.69f, 199.74f, 206.58f, 199.49f, 206.4f, 199.28f)
                    curveTo(206.23f, 199.07f, 206.0f, 198.9f, 205.71f, 198.78f)
                    curveTo(205.43f, 198.66f, 205.11f, 198.59f, 204.74f, 198.59f)
                    curveTo(204.26f, 198.59f, 203.85f, 198.69f, 203.51f, 198.88f)
                    curveTo(203.17f, 199.08f, 203.01f, 199.34f, 203.01f, 199.67f)
                    curveTo(203.01f, 199.92f, 203.11f, 200.15f, 203.32f, 200.33f)
                    curveTo(203.54f, 200.52f, 203.92f, 200.67f, 204.47f, 200.78f)
                    lineTo(206.99f, 201.26f)
                    curveTo(208.3f, 201.51f, 209.27f, 201.93f, 209.91f, 202.51f)
                    curveTo(210.55f, 203.09f, 210.87f, 203.85f, 210.88f, 204.81f)
                    curveTo(210.87f, 205.71f, 210.61f, 206.49f, 210.08f, 207.15f)
                    curveTo(209.55f, 207.82f, 208.84f, 208.33f, 207.93f, 208.7f)
                    curveTo(207.02f, 209.07f, 205.98f, 209.25f, 204.81f, 209.25f)
                    curveTo(202.94f, 209.25f, 201.47f, 208.86f, 200.39f, 208.1f)
                    curveTo(199.31f, 207.32f, 198.7f, 206.29f, 198.55f, 204.99f)
                    lineTo(202.66f, 204.89f)
                    curveTo(202.75f, 205.37f, 202.99f, 205.73f, 203.37f, 205.98f)
                    curveTo(203.75f, 206.23f, 204.24f, 206.36f, 204.83f, 206.36f)
                    curveTo(205.36f, 206.36f, 205.8f, 206.26f, 206.13f, 206.06f)
                    curveTo(206.47f, 205.86f, 206.64f, 205.6f, 206.64f, 205.27f)
                    curveTo(206.64f, 204.97f, 206.51f, 204.74f, 206.25f, 204.56f)
                    curveTo(205.99f, 204.38f, 205.59f, 204.24f, 205.05f, 204.13f)
                    lineTo(202.76f, 203.7f)
                    curveTo(201.45f, 203.46f, 200.48f, 203.02f, 199.83f, 202.38f)
                    curveTo(199.19f, 201.73f, 198.87f, 200.91f, 198.88f, 199.91f)
                    curveTo(198.87f, 199.03f, 199.11f, 198.28f, 199.58f, 197.66f)
                    curveTo(200.05f, 197.04f, 200.72f, 196.56f, 201.59f, 196.23f)
                    curveTo(202.46f, 195.9f, 203.48f, 195.74f, 204.67f, 195.74f)
                    curveTo(206.44f, 195.74f, 207.84f, 196.11f, 208.86f, 196.85f)
                    curveTo(209.88f, 197.59f, 210.45f, 198.61f, 210.55f, 199.91f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFEFEF)), stroke = null, fillAlpha = 0.35f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(69.0f, 148.0f)
                    arcToRelative(50.5f, 6.0f, 0.0f, true, false, 101.0f, 0.0f)
                    arcToRelative(50.5f, 6.0f, 0.0f, true, false, -101.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xD3FFFFFF), 1.0f to Color(0x00737373),
                        start = Offset(119.0f,45.5f), end = Offset(119.0f,150.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(86.0f, 43.25f)
                    lineTo(152.0f, 43.25f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 55.25f)
                    lineTo(164.0f, 125.0f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 137.0f)
                    lineTo(86.0f, 137.0f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 74.0f, 125.0f)
                    lineTo(74.0f, 55.25f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 86.0f, 43.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF00ADD8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(74.0f, 55.19f)
                    curveTo(74.0f, 48.56f, 79.37f, 43.19f, 86.0f, 43.19f)
                    horizontalLineTo(152.0f)
                    curveTo(158.63f, 43.19f, 164.0f, 48.56f, 164.0f, 55.19f)
                    verticalLineTo(56.99f)
                    horizontalLineTo(74.0f)
                    verticalLineTo(55.19f)
                    close()
                }
                path(fill = radialGradient(0.0f to Color(0x00ED3AF3), 1.0f to Color(0x42000000),
                        center = Offset(119.0f,50.09f), radius = 40.42f), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(74.0f, 55.19f)
                    curveTo(74.0f, 48.56f, 79.37f, 43.19f, 86.0f, 43.19f)
                    horizontalLineTo(152.0f)
                    curveTo(158.63f, 43.19f, 164.0f, 48.56f, 164.0f, 55.19f)
                    verticalLineTo(56.99f)
                    horizontalLineTo(74.0f)
                    verticalLineTo(55.19f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(89.91f, 49.85f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, 8.22f, 0.0f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, -8.22f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(90.83f, 49.85f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, 6.4f, 0.0f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, -6.4f, 0.0f)
                    close()
                }
                path(fill = radialGradient(0.27f to Color(0xFFD9D9D9), 0.64f to Color(0xFFA6A6A6),
                        1.0f to Color(0xFF737373), center = Offset(94.03f,44.85f), radius = 7.85f),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(94.03f, 37.0f)
                    lineTo(94.03f, 37.0f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 96.77f, 39.74f)
                    lineTo(96.77f, 49.96f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 94.03f, 52.7f)
                    lineTo(94.03f, 52.7f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 91.28f, 49.96f)
                    lineTo(91.28f, 39.74f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 94.03f, 37.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(140.17f, 49.85f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, 8.22f, 0.0f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, -8.22f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(141.08f, 49.85f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, 6.4f, 0.0f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, -6.4f, 0.0f)
                    close()
                }
                path(fill = radialGradient(0.27f to Color(0xFFD9D9D9), 0.64f to Color(0xFFA6A6A6),
                        1.0f to Color(0xFF737373), center = Offset(144.28f,44.85f), radius = 7.85f),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(144.28f, 37.0f)
                    lineTo(144.28f, 37.0f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 147.02f, 39.74f)
                    lineTo(147.02f, 49.96f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 144.28f, 52.7f)
                    lineTo(144.28f, 52.7f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 141.54f, 49.96f)
                    lineTo(141.54f, 39.74f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 144.28f, 37.0f)
                    close()
                }
                path(fill = linearGradient(0.34f to Color(0xFF00ADD8), 1.0f to Color(0xFF000334),
                        start = Offset(120.0f,75.0f), end = Offset(120.0f,114.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(100.72f, 106.0f)
                    verticalLineTo(101.96f)
                    lineTo(109.21f, 94.52f)
                    curveTo(109.84f, 93.95f, 110.38f, 93.42f, 110.83f, 92.94f)
                    curveTo(111.28f, 92.46f, 111.62f, 91.97f, 111.85f, 91.49f)
                    curveTo(112.09f, 91.0f, 112.21f, 90.46f, 112.21f, 89.89f)
                    curveTo(112.21f, 89.24f, 112.06f, 88.69f, 111.78f, 88.24f)
                    curveTo(111.5f, 87.78f, 111.12f, 87.42f, 110.63f, 87.17f)
                    curveTo(110.13f, 86.92f, 109.57f, 86.8f, 108.93f, 86.8f)
                    curveTo(108.29f, 86.8f, 107.72f, 86.93f, 107.24f, 87.19f)
                    curveTo(106.75f, 87.45f, 106.38f, 87.83f, 106.1f, 88.32f)
                    curveTo(105.84f, 88.81f, 105.71f, 89.41f, 105.71f, 90.11f)
                    horizontalLineTo(100.38f)
                    curveTo(100.38f, 88.53f, 100.73f, 87.16f, 101.44f, 86.01f)
                    curveTo(102.15f, 84.86f, 103.15f, 83.97f, 104.44f, 83.35f)
                    curveTo(105.74f, 82.72f, 107.24f, 82.41f, 108.96f, 82.41f)
                    curveTo(110.72f, 82.41f, 112.25f, 82.7f, 113.56f, 83.3f)
                    curveTo(114.86f, 83.89f, 115.87f, 84.71f, 116.58f, 85.77f)
                    curveTo(117.3f, 86.83f, 117.66f, 88.05f, 117.66f, 89.44f)
                    curveTo(117.66f, 90.33f, 117.48f, 91.21f, 117.13f, 92.08f)
                    curveTo(116.77f, 92.95f, 116.13f, 93.91f, 115.21f, 94.97f)
                    curveTo(114.29f, 96.02f, 112.99f, 97.28f, 111.29f, 98.75f)
                    lineTo(108.51f, 101.32f)
                    verticalLineTo(101.47f)
                    horizontalLineTo(117.94f)
                    verticalLineTo(106.0f)
                    horizontalLineTo(100.72f)
                    close()
                }
                path(fill = linearGradient(0.34f to Color(0xFF00ADD8), 1.0f to Color(0xFF000334),
                        start = Offset(120.0f,75.0f), end = Offset(120.0f,114.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(130.03f, 106.32f)
                    curveTo(128.33f, 106.32f, 126.83f, 106.01f, 125.51f, 105.4f)
                    curveTo(124.19f, 104.78f, 123.15f, 103.94f, 122.38f, 102.86f)
                    curveTo(121.63f, 101.79f, 121.23f, 100.55f, 121.2f, 99.16f)
                    horizontalLineTo(126.66f)
                    curveTo(126.7f, 100.01f, 127.05f, 100.71f, 127.7f, 101.23f)
                    curveTo(128.35f, 101.74f, 129.13f, 102.0f, 130.03f, 102.0f)
                    curveTo(130.74f, 102.0f, 131.36f, 101.85f, 131.91f, 101.53f)
                    curveTo(132.45f, 101.22f, 132.88f, 100.79f, 133.19f, 100.23f)
                    curveTo(133.5f, 99.66f, 133.65f, 99.01f, 133.65f, 98.27f)
                    curveTo(133.65f, 97.52f, 133.5f, 96.87f, 133.18f, 96.31f)
                    curveTo(132.87f, 95.75f, 132.44f, 95.31f, 131.88f, 95.0f)
                    curveTo(131.34f, 94.68f, 130.71f, 94.52f, 130.0f, 94.52f)
                    curveTo(129.32f, 94.52f, 128.68f, 94.66f, 128.08f, 94.97f)
                    curveTo(127.48f, 95.27f, 127.02f, 95.68f, 126.71f, 96.2f)
                    lineTo(121.75f, 95.27f)
                    lineTo(122.76f, 82.73f)
                    horizontalLineTo(137.69f)
                    verticalLineTo(87.26f)
                    horizontalLineTo(127.38f)
                    lineTo(126.85f, 92.75f)
                    horizontalLineTo(126.99f)
                    curveTo(127.37f, 92.11f, 127.99f, 91.58f, 128.85f, 91.16f)
                    curveTo(129.71f, 90.73f, 130.69f, 90.52f, 131.79f, 90.52f)
                    curveTo(133.19f, 90.52f, 134.43f, 90.85f, 135.52f, 91.5f)
                    curveTo(136.62f, 92.14f, 137.48f, 93.04f, 138.11f, 94.18f)
                    curveTo(138.75f, 95.33f, 139.07f, 96.64f, 139.07f, 98.11f)
                    curveTo(139.07f, 99.71f, 138.69f, 101.13f, 137.93f, 102.36f)
                    curveTo(137.18f, 103.6f, 136.13f, 104.57f, 134.77f, 105.27f)
                    curveTo(133.42f, 105.97f, 131.84f, 106.32f, 130.03f, 106.32f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF000334), 0.73f to Color(0xFF00ADD8),
                        start = Offset(137.5f,111.5f), end = Offset(158.0f,131.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(147.33f, 117.0f)
                    curveTo(147.33f, 115.89f, 148.23f, 115.0f, 149.33f, 115.0f)
                    horizontalLineTo(150.67f)
                    curveTo(151.77f, 115.0f, 152.67f, 115.89f, 152.67f, 117.0f)
                    verticalLineTo(129.0f)
                    curveTo(152.67f, 130.1f, 151.77f, 131.0f, 150.67f, 131.0f)
                    horizontalLineTo(149.33f)
                    curveTo(148.23f, 131.0f, 147.33f, 130.1f, 147.33f, 129.0f)
                    verticalLineTo(117.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF000334), 0.73f to Color(0xFF00ADD8),
                        start = Offset(137.5f,111.5f), end = Offset(158.0f,131.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(156.0f, 120.33f)
                    curveTo(157.1f, 120.33f, 158.0f, 121.23f, 158.0f, 122.33f)
                    verticalLineTo(123.67f)
                    curveTo(158.0f, 124.77f, 157.1f, 125.67f, 156.0f, 125.67f)
                    lineTo(144.0f, 125.67f)
                    curveTo(142.9f, 125.67f, 142.0f, 124.77f, 142.0f, 123.67f)
                    lineTo(142.0f, 122.33f)
                    curveTo(142.0f, 121.23f, 142.9f, 120.33f, 144.0f, 120.33f)
                    lineTo(156.0f, 120.33f)
                    close()
                }
            }
        }
        .build()
        return _created25Achievement!!
    }

private var _created25Achievement: ImageVector? = null
