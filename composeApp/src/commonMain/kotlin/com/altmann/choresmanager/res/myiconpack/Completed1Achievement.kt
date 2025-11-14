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

public val MyIconPack.Completed1Achievement: ImageVector
    get() {
        if (_completed1Achievement != null) {
            return _completed1Achievement!!
        }
        _completed1Achievement = Builder(name = "Completed1Achievement", defaultWidth = 238.0.dp,
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
                path(fill = SolidColor(Color(0xFF40871D)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(238.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(238.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF6EC841), 1.0f to Color(0xFF195742),
                        start = Offset(119.0f,-112.8f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -112.8f)
                    curveTo(5.01f, -109.31f, 18.04f, -98.16f, 30.03f, -91.84f)
                    curveTo(42.03f, -85.51f, 60.63f, -79.18f, 71.97f, -74.84f)
                    curveTo(83.3f, -70.49f, 86.7f, -70.11f, 98.03f, -65.77f)
                    curveTo(109.37f, -61.42f, 128.63f, -55.76f, 139.97f, -48.77f)
                    curveTo(151.3f, -41.78f, 156.02f, -30.82f, 166.03f, -23.84f)
                    curveTo(176.04f, -16.85f, 188.04f, -11.84f, 200.03f, -6.84f)
                    curveTo(212.03f, -1.83f, 231.67f, 4.03f, 238.0f, 6.2f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-112.8f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF6EC841), 1.0f to Color(0xFF195742),
                        start = Offset(119.0f,-59.11f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -59.11f)
                    curveTo(7.27f, -55.37f, 27.11f, -46.11f, 43.63f, -36.63f)
                    curveTo(60.16f, -27.15f, 81.98f, -12.39f, 99.17f, -2.25f)
                    curveTo(116.36f, 7.89f, 132.22f, 16.71f, 146.77f, 24.2f)
                    curveTo(161.31f, 31.7f, 171.23f, 34.56f, 186.43f, 42.72f)
                    curveTo(201.64f, 50.87f, 229.41f, 68.07f, 238.0f, 73.14f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-59.11f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF6EC841), 1.0f to Color(0xFF195742),
                        start = Offset(119.0f,6.97f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, 6.97f)
                    curveTo(6.33f, 9.77f, 25.97f, 16.2f, 37.97f, 23.79f)
                    curveTo(49.96f, 31.38f, 60.63f, 44.26f, 71.97f, 52.51f)
                    curveTo(83.3f, 60.76f, 94.63f, 67.69f, 105.97f, 73.29f)
                    curveTo(117.3f, 78.9f, 129.96f, 80.54f, 139.97f, 86.15f)
                    curveTo(149.98f, 91.75f, 154.7f, 100.0f, 166.03f, 106.93f)
                    curveTo(177.37f, 113.86f, 195.97f, 120.13f, 207.97f, 127.72f)
                    curveTo(219.96f, 135.31f, 232.99f, 148.34f, 238.0f, 152.47f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.97f)
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
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(46.3f, 198.72f)
                    horizontalLineTo(42.75f)
                    curveTo(42.71f, 198.36f, 42.61f, 198.03f, 42.46f, 197.74f)
                    curveTo(42.31f, 197.44f, 42.12f, 197.19f, 41.88f, 196.98f)
                    curveTo(41.64f, 196.78f, 41.35f, 196.62f, 41.02f, 196.51f)
                    curveTo(40.69f, 196.4f, 40.33f, 196.34f, 39.93f, 196.34f)
                    curveTo(39.23f, 196.34f, 38.62f, 196.51f, 38.11f, 196.86f)
                    curveTo(37.6f, 197.2f, 37.21f, 197.7f, 36.94f, 198.35f)
                    curveTo(36.67f, 199.01f, 36.53f, 199.8f, 36.53f, 200.73f)
                    curveTo(36.53f, 201.69f, 36.67f, 202.5f, 36.94f, 203.16f)
                    curveTo(37.22f, 203.8f, 37.61f, 204.29f, 38.12f, 204.63f)
                    curveTo(38.62f, 204.95f, 39.22f, 205.12f, 39.91f, 205.12f)
                    curveTo(40.3f, 205.12f, 40.65f, 205.07f, 40.97f, 204.97f)
                    curveTo(41.29f, 204.87f, 41.57f, 204.72f, 41.82f, 204.53f)
                    curveTo(42.06f, 204.34f, 42.26f, 204.11f, 42.42f, 203.83f)
                    curveTo(42.58f, 203.55f, 42.69f, 203.24f, 42.75f, 202.89f)
                    lineTo(46.3f, 202.91f)
                    curveTo(46.24f, 203.55f, 46.06f, 204.19f, 45.74f, 204.81f)
                    curveTo(45.44f, 205.44f, 45.01f, 206.01f, 44.47f, 206.52f)
                    curveTo(43.93f, 207.03f, 43.27f, 207.44f, 42.5f, 207.74f)
                    curveTo(41.73f, 208.05f, 40.84f, 208.2f, 39.84f, 208.2f)
                    curveTo(38.52f, 208.2f, 37.35f, 207.91f, 36.3f, 207.33f)
                    curveTo(35.27f, 206.75f, 34.45f, 205.9f, 33.85f, 204.79f)
                    curveTo(33.25f, 203.68f, 32.94f, 202.32f, 32.94f, 200.73f)
                    curveTo(32.94f, 199.13f, 33.25f, 197.77f, 33.86f, 196.66f)
                    curveTo(34.47f, 195.54f, 35.3f, 194.7f, 36.34f, 194.12f)
                    curveTo(37.38f, 193.54f, 38.55f, 193.26f, 39.84f, 193.26f)
                    curveTo(40.72f, 193.26f, 41.54f, 193.38f, 42.28f, 193.63f)
                    curveTo(43.03f, 193.87f, 43.69f, 194.22f, 44.26f, 194.69f)
                    curveTo(44.83f, 195.15f, 45.29f, 195.73f, 45.64f, 196.4f)
                    curveTo(46.0f, 197.08f, 46.22f, 197.85f, 46.3f, 198.72f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(53.41f, 208.21f)
                    curveTo(52.26f, 208.21f, 51.28f, 207.97f, 50.45f, 207.5f)
                    curveTo(49.63f, 207.03f, 49.0f, 206.37f, 48.56f, 205.53f)
                    curveTo(48.12f, 204.68f, 47.9f, 203.7f, 47.9f, 202.58f)
                    curveTo(47.9f, 201.46f, 48.12f, 200.48f, 48.56f, 199.63f)
                    curveTo(49.0f, 198.79f, 49.63f, 198.13f, 50.45f, 197.66f)
                    curveTo(51.28f, 197.19f, 52.26f, 196.95f, 53.41f, 196.95f)
                    curveTo(54.55f, 196.95f, 55.54f, 197.19f, 56.36f, 197.66f)
                    curveTo(57.18f, 198.13f, 57.81f, 198.79f, 58.25f, 199.63f)
                    curveTo(58.7f, 200.48f, 58.92f, 201.46f, 58.92f, 202.58f)
                    curveTo(58.92f, 203.7f, 58.7f, 204.68f, 58.25f, 205.53f)
                    curveTo(57.81f, 206.37f, 57.18f, 207.03f, 56.36f, 207.5f)
                    curveTo(55.54f, 207.97f, 54.55f, 208.21f, 53.41f, 208.21f)
                    close()
                    moveTo(53.43f, 205.59f)
                    curveTo(53.85f, 205.59f, 54.2f, 205.46f, 54.49f, 205.2f)
                    curveTo(54.78f, 204.95f, 55.0f, 204.59f, 55.15f, 204.14f)
                    curveTo(55.3f, 203.68f, 55.38f, 203.16f, 55.38f, 202.56f)
                    curveTo(55.38f, 201.95f, 55.3f, 201.42f, 55.15f, 200.97f)
                    curveTo(55.0f, 200.51f, 54.78f, 200.16f, 54.49f, 199.9f)
                    curveTo(54.2f, 199.65f, 53.85f, 199.52f, 53.43f, 199.52f)
                    curveTo(53.0f, 199.52f, 52.63f, 199.65f, 52.34f, 199.9f)
                    curveTo(52.04f, 200.16f, 51.82f, 200.51f, 51.66f, 200.97f)
                    curveTo(51.51f, 201.42f, 51.43f, 201.95f, 51.43f, 202.56f)
                    curveTo(51.43f, 203.16f, 51.51f, 203.68f, 51.66f, 204.14f)
                    curveTo(51.82f, 204.59f, 52.04f, 204.95f, 52.34f, 205.2f)
                    curveTo(52.63f, 205.46f, 53.0f, 205.59f, 53.43f, 205.59f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(60.7f, 208.0f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(64.0f)
                    verticalLineTo(199.09f)
                    horizontalLineTo(64.12f)
                    curveTo(64.35f, 198.43f, 64.73f, 197.91f, 65.27f, 197.52f)
                    curveTo(65.81f, 197.14f, 66.46f, 196.95f, 67.2f, 196.95f)
                    curveTo(67.96f, 196.95f, 68.61f, 197.14f, 69.15f, 197.53f)
                    curveTo(69.69f, 197.92f, 70.03f, 198.44f, 70.18f, 199.09f)
                    horizontalLineTo(70.29f)
                    curveTo(70.5f, 198.45f, 70.89f, 197.93f, 71.49f, 197.54f)
                    curveTo(72.08f, 197.15f, 72.78f, 196.95f, 73.58f, 196.95f)
                    curveTo(74.61f, 196.95f, 75.45f, 197.28f, 76.1f, 197.94f)
                    curveTo(76.74f, 198.6f, 77.06f, 199.51f, 77.06f, 200.66f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(73.59f)
                    verticalLineTo(201.45f)
                    curveTo(73.59f, 200.91f, 73.45f, 200.49f, 73.17f, 200.21f)
                    curveTo(72.89f, 199.92f, 72.53f, 199.78f, 72.08f, 199.78f)
                    curveTo(71.61f, 199.78f, 71.23f, 199.93f, 70.95f, 200.24f)
                    curveTo(70.68f, 200.55f, 70.55f, 200.97f, 70.55f, 201.49f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(67.21f)
                    verticalLineTo(201.42f)
                    curveTo(67.21f, 200.91f, 67.07f, 200.51f, 66.8f, 200.22f)
                    curveTo(66.52f, 199.92f, 66.16f, 199.78f, 65.71f, 199.78f)
                    curveTo(65.41f, 199.78f, 65.14f, 199.85f, 64.91f, 200.0f)
                    curveTo(64.68f, 200.14f, 64.5f, 200.34f, 64.36f, 200.61f)
                    curveTo(64.24f, 200.87f, 64.17f, 201.18f, 64.17f, 201.54f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(60.7f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(79.21f, 212.09f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(82.65f)
                    verticalLineTo(198.96f)
                    horizontalLineTo(82.76f)
                    curveTo(82.9f, 198.63f, 83.1f, 198.31f, 83.36f, 198.0f)
                    curveTo(83.63f, 197.69f, 83.96f, 197.44f, 84.37f, 197.25f)
                    curveTo(84.78f, 197.05f, 85.27f, 196.95f, 85.85f, 196.95f)
                    curveTo(86.61f, 196.95f, 87.31f, 197.15f, 87.97f, 197.54f)
                    curveTo(88.63f, 197.94f, 89.17f, 198.56f, 89.58f, 199.38f)
                    curveTo(89.98f, 200.21f, 90.19f, 201.27f, 90.19f, 202.55f)
                    curveTo(90.19f, 203.79f, 89.99f, 204.82f, 89.6f, 205.66f)
                    curveTo(89.21f, 206.49f, 88.68f, 207.12f, 88.02f, 207.53f)
                    curveTo(87.36f, 207.95f, 86.63f, 208.16f, 85.83f, 208.16f)
                    curveTo(85.28f, 208.16f, 84.8f, 208.07f, 84.4f, 207.89f)
                    curveTo(84.0f, 207.71f, 83.66f, 207.47f, 83.38f, 207.18f)
                    curveTo(83.11f, 206.88f, 82.9f, 206.57f, 82.76f, 206.23f)
                    horizontalLineTo(82.69f)
                    verticalLineTo(212.09f)
                    horizontalLineTo(79.21f)
                    close()
                    moveTo(82.62f, 202.54f)
                    curveTo(82.62f, 203.13f, 82.69f, 203.64f, 82.85f, 204.08f)
                    curveTo(83.01f, 204.51f, 83.24f, 204.85f, 83.54f, 205.1f)
                    curveTo(83.84f, 205.33f, 84.2f, 205.45f, 84.63f, 205.45f)
                    curveTo(85.05f, 205.45f, 85.41f, 205.33f, 85.71f, 205.1f)
                    curveTo(86.01f, 204.85f, 86.24f, 204.51f, 86.39f, 204.08f)
                    curveTo(86.54f, 203.64f, 86.62f, 203.13f, 86.62f, 202.54f)
                    curveTo(86.62f, 201.96f, 86.54f, 201.45f, 86.39f, 201.02f)
                    curveTo(86.24f, 200.59f, 86.01f, 200.25f, 85.71f, 200.02f)
                    curveTo(85.42f, 199.78f, 85.06f, 199.66f, 84.63f, 199.66f)
                    curveTo(84.2f, 199.66f, 83.84f, 199.78f, 83.54f, 200.01f)
                    curveTo(83.24f, 200.24f, 83.01f, 200.57f, 82.85f, 201.0f)
                    curveTo(82.69f, 201.43f, 82.62f, 201.95f, 82.62f, 202.54f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(95.48f, 193.45f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(92.01f)
                    verticalLineTo(193.45f)
                    horizontalLineTo(95.48f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(102.79f, 208.21f)
                    curveTo(101.65f, 208.21f, 100.66f, 207.98f, 99.84f, 207.53f)
                    curveTo(99.01f, 207.08f, 98.38f, 206.43f, 97.93f, 205.59f)
                    curveTo(97.49f, 204.75f, 97.27f, 203.75f, 97.27f, 202.59f)
                    curveTo(97.27f, 201.46f, 97.49f, 200.48f, 97.94f, 199.63f)
                    curveTo(98.38f, 198.79f, 99.01f, 198.13f, 99.82f, 197.66f)
                    curveTo(100.63f, 197.19f, 101.58f, 196.95f, 102.68f, 196.95f)
                    curveTo(103.46f, 196.95f, 104.17f, 197.07f, 104.81f, 197.31f)
                    curveTo(105.46f, 197.55f, 106.01f, 197.91f, 106.48f, 198.38f)
                    curveTo(106.95f, 198.86f, 107.32f, 199.44f, 107.58f, 200.14f)
                    curveTo(107.84f, 200.83f, 107.97f, 201.62f, 107.97f, 202.52f)
                    verticalLineTo(203.38f)
                    horizontalLineTo(98.49f)
                    verticalLineTo(201.37f)
                    horizontalLineTo(104.74f)
                    curveTo(104.73f, 201.0f, 104.64f, 200.67f, 104.47f, 200.38f)
                    curveTo(104.3f, 200.09f, 104.07f, 199.87f, 103.77f, 199.7f)
                    curveTo(103.48f, 199.54f, 103.14f, 199.46f, 102.75f, 199.46f)
                    curveTo(102.37f, 199.46f, 102.02f, 199.54f, 101.71f, 199.72f)
                    curveTo(101.4f, 199.89f, 101.16f, 200.12f, 100.98f, 200.42f)
                    curveTo(100.8f, 200.71f, 100.7f, 201.05f, 100.69f, 201.42f)
                    verticalLineTo(203.48f)
                    curveTo(100.69f, 203.92f, 100.78f, 204.31f, 100.96f, 204.65f)
                    curveTo(101.13f, 204.98f, 101.38f, 205.24f, 101.7f, 205.42f)
                    curveTo(102.03f, 205.61f, 102.41f, 205.7f, 102.85f, 205.7f)
                    curveTo(103.16f, 205.7f, 103.44f, 205.66f, 103.69f, 205.57f)
                    curveTo(103.94f, 205.49f, 104.16f, 205.36f, 104.34f, 205.2f)
                    curveTo(104.52f, 205.03f, 104.65f, 204.82f, 104.74f, 204.58f)
                    lineTo(107.93f, 204.68f)
                    curveTo(107.8f, 205.39f, 107.51f, 206.01f, 107.06f, 206.54f)
                    curveTo(106.61f, 207.07f, 106.03f, 207.48f, 105.3f, 207.77f)
                    curveTo(104.58f, 208.06f, 103.74f, 208.21f, 102.79f, 208.21f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(115.9f, 197.09f)
                    verticalLineTo(199.65f)
                    horizontalLineTo(109.02f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(115.9f)
                    close()
                    moveTo(110.46f, 194.48f)
                    horizontalLineTo(113.93f)
                    verticalLineTo(204.57f)
                    curveTo(113.93f, 204.78f, 113.96f, 204.96f, 114.03f, 205.09f)
                    curveTo(114.1f, 205.22f, 114.2f, 205.31f, 114.34f, 205.37f)
                    curveTo(114.47f, 205.42f, 114.63f, 205.44f, 114.81f, 205.44f)
                    curveTo(114.94f, 205.44f, 115.08f, 205.43f, 115.23f, 205.41f)
                    curveTo(115.38f, 205.38f, 115.5f, 205.36f, 115.57f, 205.34f)
                    lineTo(116.1f, 207.84f)
                    curveTo(115.93f, 207.89f, 115.7f, 207.95f, 115.39f, 208.02f)
                    curveTo(115.1f, 208.09f, 114.74f, 208.14f, 114.32f, 208.16f)
                    curveTo(113.51f, 208.19f, 112.81f, 208.1f, 112.23f, 207.87f)
                    curveTo(111.65f, 207.64f, 111.21f, 207.28f, 110.9f, 206.79f)
                    curveTo(110.6f, 206.3f, 110.45f, 205.69f, 110.46f, 204.95f)
                    verticalLineTo(194.48f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(122.65f, 208.21f)
                    curveTo(121.51f, 208.21f, 120.53f, 207.98f, 119.7f, 207.53f)
                    curveTo(118.88f, 207.08f, 118.24f, 206.43f, 117.79f, 205.59f)
                    curveTo(117.36f, 204.75f, 117.14f, 203.75f, 117.14f, 202.59f)
                    curveTo(117.14f, 201.46f, 117.36f, 200.48f, 117.8f, 199.63f)
                    curveTo(118.25f, 198.79f, 118.88f, 198.13f, 119.68f, 197.66f)
                    curveTo(120.49f, 197.19f, 121.45f, 196.95f, 122.55f, 196.95f)
                    curveTo(123.32f, 196.95f, 124.03f, 197.07f, 124.68f, 197.31f)
                    curveTo(125.32f, 197.55f, 125.88f, 197.91f, 126.35f, 198.38f)
                    curveTo(126.82f, 198.86f, 127.18f, 199.44f, 127.44f, 200.14f)
                    curveTo(127.7f, 200.83f, 127.83f, 201.62f, 127.83f, 202.52f)
                    verticalLineTo(203.38f)
                    horizontalLineTo(118.35f)
                    verticalLineTo(201.37f)
                    horizontalLineTo(124.6f)
                    curveTo(124.6f, 201.0f, 124.51f, 200.67f, 124.34f, 200.38f)
                    curveTo(124.17f, 200.09f, 123.93f, 199.87f, 123.63f, 199.7f)
                    curveTo(123.34f, 199.54f, 123.0f, 199.46f, 122.62f, 199.46f)
                    curveTo(122.23f, 199.46f, 121.88f, 199.54f, 121.57f, 199.72f)
                    curveTo(121.27f, 199.89f, 121.02f, 200.12f, 120.84f, 200.42f)
                    curveTo(120.66f, 200.71f, 120.57f, 201.05f, 120.56f, 201.42f)
                    verticalLineTo(203.48f)
                    curveTo(120.56f, 203.92f, 120.65f, 204.31f, 120.82f, 204.65f)
                    curveTo(121.0f, 204.98f, 121.25f, 205.24f, 121.57f, 205.42f)
                    curveTo(121.89f, 205.61f, 122.27f, 205.7f, 122.72f, 205.7f)
                    curveTo(123.03f, 205.7f, 123.3f, 205.66f, 123.56f, 205.57f)
                    curveTo(123.81f, 205.49f, 124.02f, 205.36f, 124.2f, 205.2f)
                    curveTo(124.38f, 205.03f, 124.52f, 204.82f, 124.61f, 204.58f)
                    lineTo(127.79f, 204.68f)
                    curveTo(127.66f, 205.39f, 127.37f, 206.01f, 126.92f, 206.54f)
                    curveTo(126.48f, 207.07f, 125.89f, 207.48f, 125.17f, 207.77f)
                    curveTo(124.44f, 208.06f, 123.61f, 208.21f, 122.65f, 208.21f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(133.59f, 208.16f)
                    curveTo(132.78f, 208.16f, 132.05f, 207.95f, 131.4f, 207.53f)
                    curveTo(130.74f, 207.12f, 130.21f, 206.49f, 129.82f, 205.66f)
                    curveTo(129.43f, 204.82f, 129.23f, 203.79f, 129.23f, 202.55f)
                    curveTo(129.23f, 201.27f, 129.43f, 200.21f, 129.84f, 199.38f)
                    curveTo(130.25f, 198.56f, 130.78f, 197.94f, 131.44f, 197.54f)
                    curveTo(132.1f, 197.15f, 132.81f, 196.95f, 133.57f, 196.95f)
                    curveTo(134.15f, 196.95f, 134.64f, 197.05f, 135.04f, 197.25f)
                    curveTo(135.45f, 197.44f, 135.79f, 197.69f, 136.05f, 198.0f)
                    curveTo(136.32f, 198.31f, 136.52f, 198.63f, 136.66f, 198.96f)
                    horizontalLineTo(136.73f)
                    verticalLineTo(193.45f)
                    horizontalLineTo(140.2f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(136.76f)
                    verticalLineTo(206.23f)
                    horizontalLineTo(136.66f)
                    curveTo(136.51f, 206.57f, 136.3f, 206.88f, 136.03f, 207.18f)
                    curveTo(135.76f, 207.47f, 135.42f, 207.71f, 135.02f, 207.89f)
                    curveTo(134.61f, 208.07f, 134.14f, 208.16f, 133.59f, 208.16f)
                    close()
                    moveTo(134.8f, 205.45f)
                    curveTo(135.22f, 205.45f, 135.58f, 205.33f, 135.88f, 205.1f)
                    curveTo(136.17f, 204.85f, 136.4f, 204.51f, 136.57f, 204.08f)
                    curveTo(136.73f, 203.64f, 136.81f, 203.13f, 136.81f, 202.54f)
                    curveTo(136.81f, 201.95f, 136.73f, 201.43f, 136.57f, 201.0f)
                    curveTo(136.41f, 200.57f, 136.18f, 200.24f, 135.88f, 200.01f)
                    curveTo(135.58f, 199.78f, 135.22f, 199.66f, 134.8f, 199.66f)
                    curveTo(134.37f, 199.66f, 134.0f, 199.78f, 133.7f, 200.02f)
                    curveTo(133.4f, 200.25f, 133.18f, 200.59f, 133.02f, 201.02f)
                    curveTo(132.87f, 201.45f, 132.79f, 201.96f, 132.79f, 202.54f)
                    curveTo(132.79f, 203.13f, 132.87f, 203.64f, 133.03f, 204.08f)
                    curveTo(133.18f, 204.51f, 133.41f, 204.85f, 133.7f, 205.1f)
                    curveTo(134.0f, 205.33f, 134.37f, 205.45f, 134.8f, 205.45f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(159.9f, 198.72f)
                    horizontalLineTo(156.35f)
                    curveTo(156.3f, 198.36f, 156.2f, 198.03f, 156.05f, 197.74f)
                    curveTo(155.91f, 197.44f, 155.71f, 197.19f, 155.47f, 196.98f)
                    curveTo(155.23f, 196.78f, 154.95f, 196.62f, 154.61f, 196.51f)
                    curveTo(154.29f, 196.4f, 153.93f, 196.34f, 153.53f, 196.34f)
                    curveTo(152.82f, 196.34f, 152.21f, 196.51f, 151.7f, 196.86f)
                    curveTo(151.2f, 197.2f, 150.8f, 197.7f, 150.53f, 198.35f)
                    curveTo(150.26f, 199.01f, 150.13f, 199.8f, 150.13f, 200.73f)
                    curveTo(150.13f, 201.69f, 150.26f, 202.5f, 150.54f, 203.16f)
                    curveTo(150.82f, 203.8f, 151.21f, 204.29f, 151.71f, 204.63f)
                    curveTo(152.21f, 204.95f, 152.81f, 205.12f, 153.51f, 205.12f)
                    curveTo(153.89f, 205.12f, 154.25f, 205.07f, 154.56f, 204.97f)
                    curveTo(154.89f, 204.87f, 155.17f, 204.72f, 155.41f, 204.53f)
                    curveTo(155.65f, 204.34f, 155.86f, 204.11f, 156.01f, 203.83f)
                    curveTo(156.17f, 203.55f, 156.29f, 203.24f, 156.35f, 202.89f)
                    lineTo(159.9f, 202.91f)
                    curveTo(159.84f, 203.55f, 159.65f, 204.19f, 159.34f, 204.81f)
                    curveTo(159.03f, 205.44f, 158.6f, 206.01f, 158.07f, 206.52f)
                    curveTo(157.53f, 207.03f, 156.87f, 207.44f, 156.09f, 207.74f)
                    curveTo(155.32f, 208.05f, 154.43f, 208.2f, 153.43f, 208.2f)
                    curveTo(152.12f, 208.2f, 150.94f, 207.91f, 149.9f, 207.33f)
                    curveTo(148.86f, 206.75f, 148.04f, 205.9f, 147.44f, 204.79f)
                    curveTo(146.84f, 203.68f, 146.54f, 202.32f, 146.54f, 200.73f)
                    curveTo(146.54f, 199.13f, 146.84f, 197.77f, 147.46f, 196.66f)
                    curveTo(148.07f, 195.54f, 148.89f, 194.7f, 149.93f, 194.12f)
                    curveTo(150.98f, 193.54f, 152.14f, 193.26f, 153.43f, 193.26f)
                    curveTo(154.32f, 193.26f, 155.13f, 193.38f, 155.88f, 193.63f)
                    curveTo(156.63f, 193.87f, 157.28f, 194.22f, 157.85f, 194.69f)
                    curveTo(158.42f, 195.15f, 158.88f, 195.73f, 159.24f, 196.4f)
                    curveTo(159.59f, 197.08f, 159.81f, 197.85f, 159.9f, 198.72f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(165.38f, 201.78f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(161.91f)
                    verticalLineTo(193.45f)
                    horizontalLineTo(165.27f)
                    verticalLineTo(199.09f)
                    horizontalLineTo(165.39f)
                    curveTo(165.64f, 198.42f, 166.04f, 197.9f, 166.6f, 197.52f)
                    curveTo(167.16f, 197.14f, 167.85f, 196.95f, 168.66f, 196.95f)
                    curveTo(169.43f, 196.95f, 170.1f, 197.12f, 170.67f, 197.46f)
                    curveTo(171.24f, 197.8f, 171.68f, 198.27f, 171.99f, 198.89f)
                    curveTo(172.3f, 199.5f, 172.46f, 200.22f, 172.46f, 201.05f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(168.98f)
                    verticalLineTo(201.73f)
                    curveTo(168.99f, 201.12f, 168.84f, 200.65f, 168.53f, 200.31f)
                    curveTo(168.22f, 199.97f, 167.79f, 199.8f, 167.23f, 199.8f)
                    curveTo(166.86f, 199.8f, 166.54f, 199.88f, 166.26f, 200.04f)
                    curveTo(165.99f, 200.2f, 165.77f, 200.42f, 165.62f, 200.71f)
                    curveTo(165.46f, 201.01f, 165.39f, 201.36f, 165.38f, 201.78f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(179.72f, 208.21f)
                    curveTo(178.57f, 208.21f, 177.59f, 207.97f, 176.76f, 207.5f)
                    curveTo(175.94f, 207.03f, 175.31f, 206.37f, 174.87f, 205.53f)
                    curveTo(174.43f, 204.68f, 174.21f, 203.7f, 174.21f, 202.58f)
                    curveTo(174.21f, 201.46f, 174.43f, 200.48f, 174.87f, 199.63f)
                    curveTo(175.31f, 198.79f, 175.94f, 198.13f, 176.76f, 197.66f)
                    curveTo(177.59f, 197.19f, 178.57f, 196.95f, 179.72f, 196.95f)
                    curveTo(180.86f, 196.95f, 181.85f, 197.19f, 182.66f, 197.66f)
                    curveTo(183.49f, 198.13f, 184.12f, 198.79f, 184.56f, 199.63f)
                    curveTo(185.01f, 200.48f, 185.23f, 201.46f, 185.23f, 202.58f)
                    curveTo(185.23f, 203.7f, 185.01f, 204.68f, 184.56f, 205.53f)
                    curveTo(184.12f, 206.37f, 183.49f, 207.03f, 182.66f, 207.5f)
                    curveTo(181.85f, 207.97f, 180.86f, 208.21f, 179.72f, 208.21f)
                    close()
                    moveTo(179.74f, 205.59f)
                    curveTo(180.15f, 205.59f, 180.51f, 205.46f, 180.8f, 205.2f)
                    curveTo(181.09f, 204.95f, 181.3f, 204.59f, 181.46f, 204.14f)
                    curveTo(181.61f, 203.68f, 181.69f, 203.16f, 181.69f, 202.56f)
                    curveTo(181.69f, 201.95f, 181.61f, 201.42f, 181.46f, 200.97f)
                    curveTo(181.3f, 200.51f, 181.09f, 200.16f, 180.8f, 199.9f)
                    curveTo(180.51f, 199.65f, 180.15f, 199.52f, 179.74f, 199.52f)
                    curveTo(179.31f, 199.52f, 178.94f, 199.65f, 178.64f, 199.9f)
                    curveTo(178.35f, 200.16f, 178.13f, 200.51f, 177.97f, 200.97f)
                    curveTo(177.82f, 201.42f, 177.74f, 201.95f, 177.74f, 202.56f)
                    curveTo(177.74f, 203.16f, 177.82f, 203.68f, 177.97f, 204.14f)
                    curveTo(178.13f, 204.59f, 178.35f, 204.95f, 178.64f, 205.2f)
                    curveTo(178.94f, 205.46f, 179.31f, 205.59f, 179.74f, 205.59f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(187.01f, 208.0f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(190.38f)
                    verticalLineTo(199.08f)
                    horizontalLineTo(190.49f)
                    curveTo(190.69f, 198.36f, 191.02f, 197.82f, 191.47f, 197.47f)
                    curveTo(191.92f, 197.12f, 192.44f, 196.94f, 193.04f, 196.94f)
                    curveTo(193.2f, 196.94f, 193.36f, 196.95f, 193.53f, 196.98f)
                    curveTo(193.71f, 197.0f, 193.86f, 197.03f, 194.01f, 197.07f)
                    verticalLineTo(200.09f)
                    curveTo(193.84f, 200.03f, 193.63f, 199.99f, 193.36f, 199.95f)
                    curveTo(193.09f, 199.92f, 192.85f, 199.9f, 192.65f, 199.9f)
                    curveTo(192.23f, 199.9f, 191.86f, 200.0f, 191.53f, 200.18f)
                    curveTo(191.21f, 200.36f, 190.95f, 200.61f, 190.76f, 200.94f)
                    curveTo(190.57f, 201.26f, 190.48f, 201.64f, 190.48f, 202.08f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(187.01f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF253400), 0.59f to Color(0xFF00D80E),
                        start = Offset(119.04f,212.09f), end = Offset(119.04f,199.14f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(199.96f, 208.21f)
                    curveTo(198.82f, 208.21f, 197.83f, 207.98f, 197.0f, 207.53f)
                    curveTo(196.18f, 207.08f, 195.54f, 206.43f, 195.1f, 205.59f)
                    curveTo(194.66f, 204.75f, 194.44f, 203.75f, 194.44f, 202.59f)
                    curveTo(194.44f, 201.46f, 194.66f, 200.48f, 195.11f, 199.63f)
                    curveTo(195.55f, 198.79f, 196.18f, 198.13f, 196.99f, 197.66f)
                    curveTo(197.8f, 197.19f, 198.75f, 196.95f, 199.85f, 196.95f)
                    curveTo(200.63f, 196.95f, 201.34f, 197.07f, 201.98f, 197.31f)
                    curveTo(202.63f, 197.55f, 203.18f, 197.91f, 203.65f, 198.38f)
                    curveTo(204.12f, 198.86f, 204.49f, 199.44f, 204.74f, 200.14f)
                    curveTo(205.01f, 200.83f, 205.14f, 201.62f, 205.14f, 202.52f)
                    verticalLineTo(203.38f)
                    horizontalLineTo(195.65f)
                    verticalLineTo(201.37f)
                    horizontalLineTo(201.9f)
                    curveTo(201.9f, 201.0f, 201.81f, 200.67f, 201.64f, 200.38f)
                    curveTo(201.47f, 200.09f, 201.24f, 199.87f, 200.94f, 199.7f)
                    curveTo(200.65f, 199.54f, 200.31f, 199.46f, 199.92f, 199.46f)
                    curveTo(199.53f, 199.46f, 199.19f, 199.54f, 198.88f, 199.72f)
                    curveTo(198.57f, 199.89f, 198.33f, 200.12f, 198.15f, 200.42f)
                    curveTo(197.97f, 200.71f, 197.87f, 201.05f, 197.86f, 201.42f)
                    verticalLineTo(203.48f)
                    curveTo(197.86f, 203.92f, 197.95f, 204.31f, 198.13f, 204.65f)
                    curveTo(198.3f, 204.98f, 198.55f, 205.24f, 198.87f, 205.42f)
                    curveTo(199.19f, 205.61f, 199.58f, 205.7f, 200.02f, 205.7f)
                    curveTo(200.33f, 205.7f, 200.61f, 205.66f, 200.86f, 205.57f)
                    curveTo(201.11f, 205.49f, 201.33f, 205.36f, 201.51f, 205.2f)
                    curveTo(201.69f, 205.03f, 201.82f, 204.82f, 201.91f, 204.58f)
                    lineTo(205.1f, 204.68f)
                    curveTo(204.97f, 205.39f, 204.68f, 206.01f, 204.23f, 206.54f)
                    curveTo(203.78f, 207.07f, 203.2f, 207.48f, 202.47f, 207.77f)
                    curveTo(201.75f, 208.06f, 200.91f, 208.21f, 199.96f, 208.21f)
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
                path(fill = SolidColor(Color(0xFF00D80E)), stroke = null, strokeLineWidth = 0.0f,
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
                path(fill = linearGradient(0.34f to Color(0xFF00D80E), 1.0f to Color(0xFF253400),
                        start = Offset(119.5f,76.0f), end = Offset(119.5f,115.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(111.34f, 107.57f)
                    curveTo(109.31f, 107.57f, 107.56f, 107.09f, 106.09f, 106.13f)
                    curveTo(104.62f, 105.15f, 103.49f, 103.76f, 102.69f, 101.96f)
                    curveTo(101.9f, 100.14f, 101.5f, 97.95f, 101.51f, 95.4f)
                    curveTo(101.52f, 92.84f, 101.92f, 90.68f, 102.71f, 88.9f)
                    curveTo(103.5f, 87.11f, 104.63f, 85.75f, 106.09f, 84.82f)
                    curveTo(107.56f, 83.88f, 109.31f, 83.41f, 111.34f, 83.41f)
                    curveTo(113.37f, 83.41f, 115.12f, 83.88f, 116.59f, 84.82f)
                    curveTo(118.07f, 85.75f, 119.21f, 87.11f, 120.0f, 88.9f)
                    curveTo(120.79f, 90.69f, 121.19f, 92.85f, 121.18f, 95.4f)
                    curveTo(121.18f, 97.96f, 120.78f, 100.15f, 119.99f, 101.97f)
                    curveTo(119.19f, 103.78f, 118.06f, 105.17f, 116.59f, 106.14f)
                    curveTo(115.13f, 107.09f, 113.38f, 107.57f, 111.34f, 107.57f)
                    close()
                    moveTo(111.34f, 102.97f)
                    curveTo(112.55f, 102.97f, 113.53f, 102.35f, 114.28f, 101.11f)
                    curveTo(115.03f, 99.87f, 115.4f, 97.97f, 115.4f, 95.4f)
                    curveTo(115.4f, 93.72f, 115.23f, 92.33f, 114.89f, 91.24f)
                    curveTo(114.54f, 90.14f, 114.07f, 89.32f, 113.47f, 88.78f)
                    curveTo(112.86f, 88.25f, 112.15f, 87.98f, 111.34f, 87.98f)
                    curveTo(110.14f, 87.98f, 109.16f, 88.59f, 108.42f, 89.81f)
                    curveTo(107.68f, 91.02f, 107.3f, 92.88f, 107.29f, 95.4f)
                    curveTo(107.29f, 97.1f, 107.45f, 98.52f, 107.78f, 99.64f)
                    curveTo(108.13f, 100.76f, 108.6f, 101.6f, 109.22f, 102.15f)
                    curveTo(109.83f, 102.69f, 110.54f, 102.97f, 111.34f, 102.97f)
                    close()
                }
                path(fill = linearGradient(0.34f to Color(0xFF00D80E), 1.0f to Color(0xFF253400),
                        start = Offset(119.5f,76.0f), end = Offset(119.5f,115.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(135.16f, 83.73f)
                    verticalLineTo(107.0f)
                    horizontalLineTo(129.55f)
                    verticalLineTo(88.98f)
                    horizontalLineTo(129.41f)
                    lineTo(124.21f, 92.16f)
                    verticalLineTo(87.3f)
                    lineTo(129.95f, 83.73f)
                    horizontalLineTo(135.16f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF007207), 0.73f to Color(0xFF00D80E),
                        start = Offset(138.76f,116.9f), end = Offset(152.35f,133.72f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(143.29f, 126.1f)
                    curveTo(142.58f, 125.44f, 142.53f, 124.33f, 143.18f, 123.62f)
                    curveTo(143.84f, 122.9f, 144.95f, 122.86f, 145.66f, 123.51f)
                    lineTo(149.54f, 127.06f)
                    curveTo(150.25f, 127.71f, 150.3f, 128.82f, 149.65f, 129.54f)
                    curveTo(148.99f, 130.25f, 147.89f, 130.3f, 147.17f, 129.65f)
                    lineTo(143.29f, 126.1f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF007207), 0.73f to Color(0xFF00D80E),
                        start = Offset(138.76f,116.9f), end = Offset(152.35f,133.72f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(153.77f, 119.84f)
                    curveTo(154.42f, 119.13f, 155.53f, 119.08f, 156.24f, 119.73f)
                    curveTo(156.96f, 120.39f, 157.01f, 121.5f, 156.35f, 122.21f)
                    lineTo(149.65f, 129.54f)
                    curveTo(148.99f, 130.25f, 147.89f, 130.3f, 147.17f, 129.65f)
                    curveTo(146.46f, 128.99f, 146.41f, 127.88f, 147.06f, 127.17f)
                    lineTo(153.77f, 119.84f)
                    close()
                }
            }
        }
        .build()
        return _completed1Achievement!!
    }

private var _completed1Achievement: ImageVector? = null
