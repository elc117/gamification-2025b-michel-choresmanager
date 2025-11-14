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

public val MyIconPack.Completed50Achievement: ImageVector
    get() {
        if (_completed50Achievement != null) {
            return _completed50Achievement!!
        }
        _completed50Achievement = Builder(name = "Completed50Achievement", defaultWidth = 238.0.dp,
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
                path(fill = SolidColor(Color(0xFF590322)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(238.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(238.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB2104B), 1.0f to Color(0xFF261903),
                        start = Offset(119.0f,-112.8f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -112.8f)
                    curveTo(10.58f, -107.18f, 42.97f, -89.66f, 63.47f, -79.09f)
                    curveTo(83.96f, -68.51f, 103.13f, -59.25f, 122.97f, -49.34f)
                    curveTo(142.8f, -39.42f, 163.29f, -28.84f, 182.47f, -19.59f)
                    curveTo(201.64f, -10.33f, 228.74f, 1.9f, 238.0f, 6.2f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-112.8f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB2104B), 1.0f to Color(0xFF261903),
                        start = Offset(119.0f,-46.72f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -46.72f)
                    curveTo(7.27f, -42.97f, 27.11f, -33.71f, 43.63f, -24.23f)
                    curveTo(60.16f, -14.76f, 83.3f, 0.01f, 99.17f, 10.15f)
                    curveTo(115.03f, 20.29f, 124.29f, 29.1f, 138.83f, 36.6f)
                    curveTo(153.38f, 44.09f, 169.91f, 46.96f, 186.43f, 55.11f)
                    curveTo(202.96f, 63.27f, 229.41f, 80.46f, 238.0f, 85.53f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-46.72f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFB2104B), 1.0f to Color(0xFF261903),
                        start = Offset(119.0f,6.97f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, 6.97f)
                    curveTo(8.59f, 12.48f, 36.36f, 29.68f, 51.57f, 40.04f)
                    curveTo(66.77f, 50.4f, 76.69f, 60.76f, 91.23f, 69.14f)
                    curveTo(105.78f, 77.51f, 121.64f, 81.93f, 138.83f, 90.3f)
                    curveTo(156.02f, 98.68f, 177.84f, 109.04f, 194.37f, 119.4f)
                    curveTo(210.89f, 129.76f, 230.73f, 146.96f, 238.0f, 152.47f)
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
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(40.3f, 198.72f)
                    horizontalLineTo(36.75f)
                    curveTo(36.71f, 198.36f, 36.61f, 198.03f, 36.46f, 197.74f)
                    curveTo(36.31f, 197.44f, 36.12f, 197.19f, 35.88f, 196.98f)
                    curveTo(35.64f, 196.78f, 35.35f, 196.62f, 35.02f, 196.51f)
                    curveTo(34.69f, 196.4f, 34.33f, 196.34f, 33.93f, 196.34f)
                    curveTo(33.23f, 196.34f, 32.62f, 196.51f, 32.11f, 196.86f)
                    curveTo(31.6f, 197.2f, 31.21f, 197.7f, 30.94f, 198.35f)
                    curveTo(30.67f, 199.01f, 30.53f, 199.8f, 30.53f, 200.73f)
                    curveTo(30.53f, 201.69f, 30.67f, 202.5f, 30.94f, 203.16f)
                    curveTo(31.22f, 203.8f, 31.61f, 204.29f, 32.12f, 204.63f)
                    curveTo(32.62f, 204.95f, 33.22f, 205.12f, 33.91f, 205.12f)
                    curveTo(34.3f, 205.12f, 34.65f, 205.07f, 34.97f, 204.97f)
                    curveTo(35.29f, 204.87f, 35.57f, 204.72f, 35.82f, 204.53f)
                    curveTo(36.06f, 204.34f, 36.26f, 204.11f, 36.42f, 203.83f)
                    curveTo(36.58f, 203.55f, 36.69f, 203.24f, 36.75f, 202.89f)
                    lineTo(40.3f, 202.91f)
                    curveTo(40.24f, 203.55f, 40.06f, 204.19f, 39.74f, 204.81f)
                    curveTo(39.44f, 205.44f, 39.01f, 206.01f, 38.47f, 206.52f)
                    curveTo(37.93f, 207.03f, 37.27f, 207.44f, 36.5f, 207.74f)
                    curveTo(35.73f, 208.05f, 34.84f, 208.2f, 33.84f, 208.2f)
                    curveTo(32.52f, 208.2f, 31.35f, 207.91f, 30.3f, 207.33f)
                    curveTo(29.27f, 206.75f, 28.45f, 205.9f, 27.85f, 204.79f)
                    curveTo(27.25f, 203.68f, 26.94f, 202.32f, 26.94f, 200.73f)
                    curveTo(26.94f, 199.13f, 27.25f, 197.77f, 27.86f, 196.66f)
                    curveTo(28.47f, 195.54f, 29.3f, 194.7f, 30.34f, 194.12f)
                    curveTo(31.38f, 193.54f, 32.55f, 193.26f, 33.84f, 193.26f)
                    curveTo(34.72f, 193.26f, 35.54f, 193.38f, 36.28f, 193.63f)
                    curveTo(37.03f, 193.87f, 37.69f, 194.22f, 38.26f, 194.69f)
                    curveTo(38.83f, 195.15f, 39.29f, 195.73f, 39.64f, 196.4f)
                    curveTo(40.0f, 197.08f, 40.22f, 197.85f, 40.3f, 198.72f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(47.41f, 208.21f)
                    curveTo(46.26f, 208.21f, 45.28f, 207.97f, 44.45f, 207.5f)
                    curveTo(43.63f, 207.03f, 43.0f, 206.37f, 42.56f, 205.53f)
                    curveTo(42.12f, 204.68f, 41.9f, 203.7f, 41.9f, 202.58f)
                    curveTo(41.9f, 201.46f, 42.12f, 200.48f, 42.56f, 199.63f)
                    curveTo(43.0f, 198.79f, 43.63f, 198.13f, 44.45f, 197.66f)
                    curveTo(45.28f, 197.19f, 46.26f, 196.95f, 47.41f, 196.95f)
                    curveTo(48.55f, 196.95f, 49.54f, 197.19f, 50.36f, 197.66f)
                    curveTo(51.18f, 198.13f, 51.81f, 198.79f, 52.25f, 199.63f)
                    curveTo(52.7f, 200.48f, 52.92f, 201.46f, 52.92f, 202.58f)
                    curveTo(52.92f, 203.7f, 52.7f, 204.68f, 52.25f, 205.53f)
                    curveTo(51.81f, 206.37f, 51.18f, 207.03f, 50.36f, 207.5f)
                    curveTo(49.54f, 207.97f, 48.55f, 208.21f, 47.41f, 208.21f)
                    close()
                    moveTo(47.43f, 205.59f)
                    curveTo(47.85f, 205.59f, 48.2f, 205.46f, 48.49f, 205.2f)
                    curveTo(48.78f, 204.95f, 49.0f, 204.59f, 49.15f, 204.14f)
                    curveTo(49.3f, 203.68f, 49.38f, 203.16f, 49.38f, 202.56f)
                    curveTo(49.38f, 201.95f, 49.3f, 201.42f, 49.15f, 200.97f)
                    curveTo(49.0f, 200.51f, 48.78f, 200.16f, 48.49f, 199.9f)
                    curveTo(48.2f, 199.65f, 47.85f, 199.52f, 47.43f, 199.52f)
                    curveTo(47.0f, 199.52f, 46.63f, 199.65f, 46.34f, 199.9f)
                    curveTo(46.04f, 200.16f, 45.82f, 200.51f, 45.66f, 200.97f)
                    curveTo(45.51f, 201.42f, 45.43f, 201.95f, 45.43f, 202.56f)
                    curveTo(45.43f, 203.16f, 45.51f, 203.68f, 45.66f, 204.14f)
                    curveTo(45.82f, 204.59f, 46.04f, 204.95f, 46.34f, 205.2f)
                    curveTo(46.63f, 205.46f, 47.0f, 205.59f, 47.43f, 205.59f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(54.7f, 208.0f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(58.0f)
                    verticalLineTo(199.09f)
                    horizontalLineTo(58.12f)
                    curveTo(58.35f, 198.43f, 58.73f, 197.91f, 59.27f, 197.52f)
                    curveTo(59.81f, 197.14f, 60.46f, 196.95f, 61.2f, 196.95f)
                    curveTo(61.96f, 196.95f, 62.61f, 197.14f, 63.15f, 197.53f)
                    curveTo(63.69f, 197.92f, 64.03f, 198.44f, 64.18f, 199.09f)
                    horizontalLineTo(64.29f)
                    curveTo(64.5f, 198.45f, 64.89f, 197.93f, 65.49f, 197.54f)
                    curveTo(66.08f, 197.15f, 66.78f, 196.95f, 67.58f, 196.95f)
                    curveTo(68.61f, 196.95f, 69.45f, 197.28f, 70.1f, 197.94f)
                    curveTo(70.74f, 198.6f, 71.06f, 199.51f, 71.06f, 200.66f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(67.59f)
                    verticalLineTo(201.45f)
                    curveTo(67.59f, 200.91f, 67.45f, 200.49f, 67.17f, 200.21f)
                    curveTo(66.89f, 199.92f, 66.53f, 199.78f, 66.08f, 199.78f)
                    curveTo(65.61f, 199.78f, 65.23f, 199.93f, 64.95f, 200.24f)
                    curveTo(64.68f, 200.55f, 64.55f, 200.97f, 64.55f, 201.49f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(61.21f)
                    verticalLineTo(201.42f)
                    curveTo(61.21f, 200.91f, 61.07f, 200.51f, 60.8f, 200.22f)
                    curveTo(60.52f, 199.92f, 60.16f, 199.78f, 59.71f, 199.78f)
                    curveTo(59.41f, 199.78f, 59.14f, 199.85f, 58.91f, 200.0f)
                    curveTo(58.68f, 200.14f, 58.5f, 200.34f, 58.36f, 200.61f)
                    curveTo(58.24f, 200.87f, 58.17f, 201.18f, 58.17f, 201.54f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(54.7f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(73.21f, 212.09f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(76.65f)
                    verticalLineTo(198.96f)
                    horizontalLineTo(76.76f)
                    curveTo(76.9f, 198.63f, 77.1f, 198.31f, 77.36f, 198.0f)
                    curveTo(77.63f, 197.69f, 77.96f, 197.44f, 78.37f, 197.25f)
                    curveTo(78.78f, 197.05f, 79.27f, 196.95f, 79.85f, 196.95f)
                    curveTo(80.61f, 196.95f, 81.31f, 197.15f, 81.97f, 197.54f)
                    curveTo(82.63f, 197.94f, 83.17f, 198.56f, 83.58f, 199.38f)
                    curveTo(83.98f, 200.21f, 84.19f, 201.27f, 84.19f, 202.55f)
                    curveTo(84.19f, 203.79f, 83.99f, 204.82f, 83.6f, 205.66f)
                    curveTo(83.21f, 206.49f, 82.68f, 207.12f, 82.02f, 207.53f)
                    curveTo(81.36f, 207.95f, 80.63f, 208.16f, 79.83f, 208.16f)
                    curveTo(79.28f, 208.16f, 78.8f, 208.07f, 78.4f, 207.89f)
                    curveTo(78.0f, 207.71f, 77.66f, 207.47f, 77.38f, 207.18f)
                    curveTo(77.11f, 206.88f, 76.9f, 206.57f, 76.76f, 206.23f)
                    horizontalLineTo(76.69f)
                    verticalLineTo(212.09f)
                    horizontalLineTo(73.21f)
                    close()
                    moveTo(76.62f, 202.54f)
                    curveTo(76.62f, 203.13f, 76.69f, 203.64f, 76.85f, 204.08f)
                    curveTo(77.01f, 204.51f, 77.24f, 204.85f, 77.54f, 205.1f)
                    curveTo(77.84f, 205.33f, 78.2f, 205.45f, 78.63f, 205.45f)
                    curveTo(79.05f, 205.45f, 79.41f, 205.33f, 79.71f, 205.1f)
                    curveTo(80.01f, 204.85f, 80.24f, 204.51f, 80.39f, 204.08f)
                    curveTo(80.54f, 203.64f, 80.62f, 203.13f, 80.62f, 202.54f)
                    curveTo(80.62f, 201.96f, 80.54f, 201.45f, 80.39f, 201.02f)
                    curveTo(80.24f, 200.59f, 80.01f, 200.25f, 79.71f, 200.02f)
                    curveTo(79.42f, 199.78f, 79.06f, 199.66f, 78.63f, 199.66f)
                    curveTo(78.2f, 199.66f, 77.84f, 199.78f, 77.54f, 200.01f)
                    curveTo(77.24f, 200.24f, 77.01f, 200.57f, 76.85f, 201.0f)
                    curveTo(76.69f, 201.43f, 76.62f, 201.95f, 76.62f, 202.54f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(89.48f, 193.45f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(86.01f)
                    verticalLineTo(193.45f)
                    horizontalLineTo(89.48f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(96.79f, 208.21f)
                    curveTo(95.65f, 208.21f, 94.66f, 207.98f, 93.84f, 207.53f)
                    curveTo(93.01f, 207.08f, 92.38f, 206.43f, 91.93f, 205.59f)
                    curveTo(91.49f, 204.75f, 91.27f, 203.75f, 91.27f, 202.59f)
                    curveTo(91.27f, 201.46f, 91.49f, 200.48f, 91.94f, 199.63f)
                    curveTo(92.38f, 198.79f, 93.01f, 198.13f, 93.82f, 197.66f)
                    curveTo(94.63f, 197.19f, 95.59f, 196.95f, 96.68f, 196.95f)
                    curveTo(97.46f, 196.95f, 98.17f, 197.07f, 98.81f, 197.31f)
                    curveTo(99.46f, 197.55f, 100.01f, 197.91f, 100.48f, 198.38f)
                    curveTo(100.95f, 198.86f, 101.32f, 199.44f, 101.58f, 200.14f)
                    curveTo(101.84f, 200.83f, 101.97f, 201.62f, 101.97f, 202.52f)
                    verticalLineTo(203.38f)
                    horizontalLineTo(92.49f)
                    verticalLineTo(201.37f)
                    horizontalLineTo(98.74f)
                    curveTo(98.73f, 201.0f, 98.64f, 200.67f, 98.47f, 200.38f)
                    curveTo(98.3f, 200.09f, 98.07f, 199.87f, 97.77f, 199.7f)
                    curveTo(97.48f, 199.54f, 97.14f, 199.46f, 96.75f, 199.46f)
                    curveTo(96.37f, 199.46f, 96.02f, 199.54f, 95.71f, 199.72f)
                    curveTo(95.4f, 199.89f, 95.16f, 200.12f, 94.98f, 200.42f)
                    curveTo(94.8f, 200.71f, 94.7f, 201.05f, 94.69f, 201.42f)
                    verticalLineTo(203.48f)
                    curveTo(94.69f, 203.92f, 94.78f, 204.31f, 94.96f, 204.65f)
                    curveTo(95.13f, 204.98f, 95.38f, 205.24f, 95.7f, 205.42f)
                    curveTo(96.03f, 205.61f, 96.41f, 205.7f, 96.85f, 205.7f)
                    curveTo(97.16f, 205.7f, 97.44f, 205.66f, 97.69f, 205.57f)
                    curveTo(97.94f, 205.49f, 98.16f, 205.36f, 98.34f, 205.2f)
                    curveTo(98.52f, 205.03f, 98.65f, 204.82f, 98.74f, 204.58f)
                    lineTo(101.93f, 204.68f)
                    curveTo(101.8f, 205.39f, 101.51f, 206.01f, 101.06f, 206.54f)
                    curveTo(100.61f, 207.07f, 100.03f, 207.48f, 99.3f, 207.77f)
                    curveTo(98.58f, 208.06f, 97.74f, 208.21f, 96.79f, 208.21f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(109.9f, 197.09f)
                    verticalLineTo(199.65f)
                    horizontalLineTo(103.02f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(109.9f)
                    close()
                    moveTo(104.46f, 194.48f)
                    horizontalLineTo(107.93f)
                    verticalLineTo(204.57f)
                    curveTo(107.93f, 204.78f, 107.96f, 204.96f, 108.03f, 205.09f)
                    curveTo(108.1f, 205.22f, 108.2f, 205.31f, 108.34f, 205.37f)
                    curveTo(108.47f, 205.42f, 108.63f, 205.44f, 108.81f, 205.44f)
                    curveTo(108.94f, 205.44f, 109.08f, 205.43f, 109.23f, 205.41f)
                    curveTo(109.38f, 205.38f, 109.5f, 205.36f, 109.57f, 205.34f)
                    lineTo(110.1f, 207.84f)
                    curveTo(109.93f, 207.89f, 109.7f, 207.95f, 109.39f, 208.02f)
                    curveTo(109.1f, 208.09f, 108.74f, 208.14f, 108.32f, 208.16f)
                    curveTo(107.51f, 208.19f, 106.81f, 208.1f, 106.23f, 207.87f)
                    curveTo(105.65f, 207.64f, 105.21f, 207.28f, 104.9f, 206.79f)
                    curveTo(104.6f, 206.3f, 104.45f, 205.69f, 104.46f, 204.95f)
                    verticalLineTo(194.48f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(116.65f, 208.21f)
                    curveTo(115.51f, 208.21f, 114.53f, 207.98f, 113.7f, 207.53f)
                    curveTo(112.88f, 207.08f, 112.24f, 206.43f, 111.79f, 205.59f)
                    curveTo(111.36f, 204.75f, 111.14f, 203.75f, 111.14f, 202.59f)
                    curveTo(111.14f, 201.46f, 111.36f, 200.48f, 111.8f, 199.63f)
                    curveTo(112.25f, 198.79f, 112.88f, 198.13f, 113.68f, 197.66f)
                    curveTo(114.49f, 197.19f, 115.45f, 196.95f, 116.55f, 196.95f)
                    curveTo(117.32f, 196.95f, 118.03f, 197.07f, 118.68f, 197.31f)
                    curveTo(119.32f, 197.55f, 119.88f, 197.91f, 120.35f, 198.38f)
                    curveTo(120.82f, 198.86f, 121.18f, 199.44f, 121.44f, 200.14f)
                    curveTo(121.7f, 200.83f, 121.83f, 201.62f, 121.83f, 202.52f)
                    verticalLineTo(203.38f)
                    horizontalLineTo(112.35f)
                    verticalLineTo(201.37f)
                    horizontalLineTo(118.6f)
                    curveTo(118.6f, 201.0f, 118.51f, 200.67f, 118.34f, 200.38f)
                    curveTo(118.17f, 200.09f, 117.93f, 199.87f, 117.63f, 199.7f)
                    curveTo(117.34f, 199.54f, 117.0f, 199.46f, 116.62f, 199.46f)
                    curveTo(116.23f, 199.46f, 115.88f, 199.54f, 115.57f, 199.72f)
                    curveTo(115.27f, 199.89f, 115.02f, 200.12f, 114.84f, 200.42f)
                    curveTo(114.66f, 200.71f, 114.57f, 201.05f, 114.56f, 201.42f)
                    verticalLineTo(203.48f)
                    curveTo(114.56f, 203.92f, 114.65f, 204.31f, 114.82f, 204.65f)
                    curveTo(115.0f, 204.98f, 115.25f, 205.24f, 115.57f, 205.42f)
                    curveTo(115.89f, 205.61f, 116.27f, 205.7f, 116.72f, 205.7f)
                    curveTo(117.03f, 205.7f, 117.3f, 205.66f, 117.56f, 205.57f)
                    curveTo(117.81f, 205.49f, 118.02f, 205.36f, 118.2f, 205.2f)
                    curveTo(118.38f, 205.03f, 118.52f, 204.82f, 118.61f, 204.58f)
                    lineTo(121.79f, 204.68f)
                    curveTo(121.66f, 205.39f, 121.37f, 206.01f, 120.92f, 206.54f)
                    curveTo(120.48f, 207.07f, 119.89f, 207.48f, 119.17f, 207.77f)
                    curveTo(118.44f, 208.06f, 117.61f, 208.21f, 116.65f, 208.21f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(127.59f, 208.16f)
                    curveTo(126.78f, 208.16f, 126.05f, 207.95f, 125.39f, 207.53f)
                    curveTo(124.74f, 207.12f, 124.21f, 206.49f, 123.82f, 205.66f)
                    curveTo(123.43f, 204.82f, 123.23f, 203.79f, 123.23f, 202.55f)
                    curveTo(123.23f, 201.27f, 123.43f, 200.21f, 123.84f, 199.38f)
                    curveTo(124.25f, 198.56f, 124.78f, 197.94f, 125.44f, 197.54f)
                    curveTo(126.1f, 197.15f, 126.81f, 196.95f, 127.57f, 196.95f)
                    curveTo(128.15f, 196.95f, 128.64f, 197.05f, 129.04f, 197.25f)
                    curveTo(129.45f, 197.44f, 129.79f, 197.69f, 130.05f, 198.0f)
                    curveTo(130.32f, 198.31f, 130.52f, 198.63f, 130.66f, 198.96f)
                    horizontalLineTo(130.73f)
                    verticalLineTo(193.45f)
                    horizontalLineTo(134.2f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(130.76f)
                    verticalLineTo(206.23f)
                    horizontalLineTo(130.66f)
                    curveTo(130.51f, 206.57f, 130.3f, 206.88f, 130.03f, 207.18f)
                    curveTo(129.76f, 207.47f, 129.42f, 207.71f, 129.02f, 207.89f)
                    curveTo(128.61f, 208.07f, 128.14f, 208.16f, 127.59f, 208.16f)
                    close()
                    moveTo(128.8f, 205.45f)
                    curveTo(129.22f, 205.45f, 129.58f, 205.33f, 129.88f, 205.1f)
                    curveTo(130.17f, 204.85f, 130.4f, 204.51f, 130.57f, 204.08f)
                    curveTo(130.73f, 203.64f, 130.81f, 203.13f, 130.81f, 202.54f)
                    curveTo(130.81f, 201.95f, 130.73f, 201.43f, 130.57f, 201.0f)
                    curveTo(130.41f, 200.57f, 130.18f, 200.24f, 129.88f, 200.01f)
                    curveTo(129.58f, 199.78f, 129.22f, 199.66f, 128.8f, 199.66f)
                    curveTo(128.37f, 199.66f, 128.0f, 199.78f, 127.7f, 200.02f)
                    curveTo(127.4f, 200.25f, 127.18f, 200.59f, 127.02f, 201.02f)
                    curveTo(126.87f, 201.45f, 126.79f, 201.96f, 126.79f, 202.54f)
                    curveTo(126.79f, 203.13f, 126.87f, 203.64f, 127.03f, 204.08f)
                    curveTo(127.18f, 204.51f, 127.41f, 204.85f, 127.7f, 205.1f)
                    curveTo(128.0f, 205.33f, 128.37f, 205.45f, 128.8f, 205.45f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(153.9f, 198.72f)
                    horizontalLineTo(150.35f)
                    curveTo(150.3f, 198.36f, 150.2f, 198.03f, 150.05f, 197.74f)
                    curveTo(149.91f, 197.44f, 149.71f, 197.19f, 149.47f, 196.98f)
                    curveTo(149.23f, 196.78f, 148.95f, 196.62f, 148.61f, 196.51f)
                    curveTo(148.29f, 196.4f, 147.93f, 196.34f, 147.53f, 196.34f)
                    curveTo(146.82f, 196.34f, 146.21f, 196.51f, 145.7f, 196.86f)
                    curveTo(145.2f, 197.2f, 144.8f, 197.7f, 144.53f, 198.35f)
                    curveTo(144.26f, 199.01f, 144.13f, 199.8f, 144.13f, 200.73f)
                    curveTo(144.13f, 201.69f, 144.26f, 202.5f, 144.54f, 203.16f)
                    curveTo(144.82f, 203.8f, 145.21f, 204.29f, 145.71f, 204.63f)
                    curveTo(146.21f, 204.95f, 146.81f, 205.12f, 147.51f, 205.12f)
                    curveTo(147.89f, 205.12f, 148.25f, 205.07f, 148.56f, 204.97f)
                    curveTo(148.89f, 204.87f, 149.17f, 204.72f, 149.41f, 204.53f)
                    curveTo(149.65f, 204.34f, 149.86f, 204.11f, 150.01f, 203.83f)
                    curveTo(150.17f, 203.55f, 150.29f, 203.24f, 150.35f, 202.89f)
                    lineTo(153.9f, 202.91f)
                    curveTo(153.84f, 203.55f, 153.65f, 204.19f, 153.34f, 204.81f)
                    curveTo(153.03f, 205.44f, 152.6f, 206.01f, 152.07f, 206.52f)
                    curveTo(151.53f, 207.03f, 150.87f, 207.44f, 150.09f, 207.74f)
                    curveTo(149.32f, 208.05f, 148.43f, 208.2f, 147.43f, 208.2f)
                    curveTo(146.12f, 208.2f, 144.94f, 207.91f, 143.9f, 207.33f)
                    curveTo(142.86f, 206.75f, 142.04f, 205.9f, 141.44f, 204.79f)
                    curveTo(140.84f, 203.68f, 140.54f, 202.32f, 140.54f, 200.73f)
                    curveTo(140.54f, 199.13f, 140.84f, 197.77f, 141.46f, 196.66f)
                    curveTo(142.07f, 195.54f, 142.89f, 194.7f, 143.93f, 194.12f)
                    curveTo(144.98f, 193.54f, 146.14f, 193.26f, 147.43f, 193.26f)
                    curveTo(148.32f, 193.26f, 149.13f, 193.38f, 149.88f, 193.63f)
                    curveTo(150.63f, 193.87f, 151.28f, 194.22f, 151.85f, 194.69f)
                    curveTo(152.42f, 195.15f, 152.88f, 195.73f, 153.24f, 196.4f)
                    curveTo(153.59f, 197.08f, 153.81f, 197.85f, 153.9f, 198.72f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(159.38f, 201.78f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(155.91f)
                    verticalLineTo(193.45f)
                    horizontalLineTo(159.27f)
                    verticalLineTo(199.09f)
                    horizontalLineTo(159.39f)
                    curveTo(159.64f, 198.42f, 160.04f, 197.9f, 160.6f, 197.52f)
                    curveTo(161.16f, 197.14f, 161.85f, 196.95f, 162.66f, 196.95f)
                    curveTo(163.43f, 196.95f, 164.1f, 197.12f, 164.67f, 197.46f)
                    curveTo(165.24f, 197.8f, 165.68f, 198.27f, 165.99f, 198.89f)
                    curveTo(166.3f, 199.5f, 166.46f, 200.22f, 166.46f, 201.05f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(162.98f)
                    verticalLineTo(201.73f)
                    curveTo(162.99f, 201.12f, 162.84f, 200.65f, 162.53f, 200.31f)
                    curveTo(162.22f, 199.97f, 161.79f, 199.8f, 161.23f, 199.8f)
                    curveTo(160.86f, 199.8f, 160.54f, 199.88f, 160.26f, 200.04f)
                    curveTo(159.99f, 200.2f, 159.77f, 200.42f, 159.62f, 200.71f)
                    curveTo(159.46f, 201.01f, 159.39f, 201.36f, 159.38f, 201.78f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(173.72f, 208.21f)
                    curveTo(172.57f, 208.21f, 171.59f, 207.97f, 170.76f, 207.5f)
                    curveTo(169.94f, 207.03f, 169.31f, 206.37f, 168.87f, 205.53f)
                    curveTo(168.43f, 204.68f, 168.21f, 203.7f, 168.21f, 202.58f)
                    curveTo(168.21f, 201.46f, 168.43f, 200.48f, 168.87f, 199.63f)
                    curveTo(169.31f, 198.79f, 169.94f, 198.13f, 170.76f, 197.66f)
                    curveTo(171.59f, 197.19f, 172.57f, 196.95f, 173.72f, 196.95f)
                    curveTo(174.86f, 196.95f, 175.85f, 197.19f, 176.66f, 197.66f)
                    curveTo(177.49f, 198.13f, 178.12f, 198.79f, 178.56f, 199.63f)
                    curveTo(179.01f, 200.48f, 179.23f, 201.46f, 179.23f, 202.58f)
                    curveTo(179.23f, 203.7f, 179.01f, 204.68f, 178.56f, 205.53f)
                    curveTo(178.12f, 206.37f, 177.49f, 207.03f, 176.66f, 207.5f)
                    curveTo(175.85f, 207.97f, 174.86f, 208.21f, 173.72f, 208.21f)
                    close()
                    moveTo(173.74f, 205.59f)
                    curveTo(174.15f, 205.59f, 174.51f, 205.46f, 174.8f, 205.2f)
                    curveTo(175.09f, 204.95f, 175.3f, 204.59f, 175.46f, 204.14f)
                    curveTo(175.61f, 203.68f, 175.69f, 203.16f, 175.69f, 202.56f)
                    curveTo(175.69f, 201.95f, 175.61f, 201.42f, 175.46f, 200.97f)
                    curveTo(175.3f, 200.51f, 175.09f, 200.16f, 174.8f, 199.9f)
                    curveTo(174.51f, 199.65f, 174.15f, 199.52f, 173.74f, 199.52f)
                    curveTo(173.31f, 199.52f, 172.94f, 199.65f, 172.64f, 199.9f)
                    curveTo(172.35f, 200.16f, 172.13f, 200.51f, 171.97f, 200.97f)
                    curveTo(171.82f, 201.42f, 171.74f, 201.95f, 171.74f, 202.56f)
                    curveTo(171.74f, 203.16f, 171.82f, 203.68f, 171.97f, 204.14f)
                    curveTo(172.13f, 204.59f, 172.35f, 204.95f, 172.64f, 205.2f)
                    curveTo(172.94f, 205.46f, 173.31f, 205.59f, 173.74f, 205.59f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(181.01f, 208.0f)
                    verticalLineTo(197.09f)
                    horizontalLineTo(184.38f)
                    verticalLineTo(199.08f)
                    horizontalLineTo(184.49f)
                    curveTo(184.69f, 198.36f, 185.02f, 197.82f, 185.47f, 197.47f)
                    curveTo(185.92f, 197.12f, 186.44f, 196.94f, 187.04f, 196.94f)
                    curveTo(187.2f, 196.94f, 187.36f, 196.95f, 187.53f, 196.98f)
                    curveTo(187.71f, 197.0f, 187.86f, 197.03f, 188.01f, 197.07f)
                    verticalLineTo(200.09f)
                    curveTo(187.84f, 200.03f, 187.63f, 199.99f, 187.36f, 199.95f)
                    curveTo(187.09f, 199.92f, 186.85f, 199.9f, 186.65f, 199.9f)
                    curveTo(186.23f, 199.9f, 185.86f, 200.0f, 185.53f, 200.18f)
                    curveTo(185.21f, 200.36f, 184.95f, 200.61f, 184.76f, 200.94f)
                    curveTo(184.57f, 201.26f, 184.48f, 201.64f, 184.48f, 202.08f)
                    verticalLineTo(208.0f)
                    horizontalLineTo(181.01f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(193.96f, 208.21f)
                    curveTo(192.82f, 208.21f, 191.83f, 207.98f, 191.0f, 207.53f)
                    curveTo(190.18f, 207.08f, 189.54f, 206.43f, 189.1f, 205.59f)
                    curveTo(188.66f, 204.75f, 188.44f, 203.75f, 188.44f, 202.59f)
                    curveTo(188.44f, 201.46f, 188.66f, 200.48f, 189.11f, 199.63f)
                    curveTo(189.55f, 198.79f, 190.18f, 198.13f, 190.99f, 197.66f)
                    curveTo(191.8f, 197.19f, 192.75f, 196.95f, 193.85f, 196.95f)
                    curveTo(194.63f, 196.95f, 195.34f, 197.07f, 195.98f, 197.31f)
                    curveTo(196.63f, 197.55f, 197.18f, 197.91f, 197.65f, 198.38f)
                    curveTo(198.12f, 198.86f, 198.49f, 199.44f, 198.74f, 200.14f)
                    curveTo(199.01f, 200.83f, 199.14f, 201.62f, 199.14f, 202.52f)
                    verticalLineTo(203.38f)
                    horizontalLineTo(189.65f)
                    verticalLineTo(201.37f)
                    horizontalLineTo(195.9f)
                    curveTo(195.9f, 201.0f, 195.81f, 200.67f, 195.64f, 200.38f)
                    curveTo(195.47f, 200.09f, 195.24f, 199.87f, 194.94f, 199.7f)
                    curveTo(194.65f, 199.54f, 194.31f, 199.46f, 193.92f, 199.46f)
                    curveTo(193.53f, 199.46f, 193.19f, 199.54f, 192.88f, 199.72f)
                    curveTo(192.57f, 199.89f, 192.33f, 200.12f, 192.15f, 200.42f)
                    curveTo(191.97f, 200.71f, 191.87f, 201.05f, 191.86f, 201.42f)
                    verticalLineTo(203.48f)
                    curveTo(191.86f, 203.92f, 191.95f, 204.31f, 192.13f, 204.65f)
                    curveTo(192.3f, 204.98f, 192.55f, 205.24f, 192.87f, 205.42f)
                    curveTo(193.19f, 205.61f, 193.58f, 205.7f, 194.02f, 205.7f)
                    curveTo(194.33f, 205.7f, 194.61f, 205.66f, 194.86f, 205.57f)
                    curveTo(195.11f, 205.49f, 195.33f, 205.36f, 195.51f, 205.2f)
                    curveTo(195.69f, 205.03f, 195.82f, 204.82f, 195.91f, 204.58f)
                    lineTo(199.1f, 204.68f)
                    curveTo(198.97f, 205.39f, 198.68f, 206.01f, 198.23f, 206.54f)
                    curveTo(197.78f, 207.07f, 197.2f, 207.48f, 196.47f, 207.77f)
                    curveTo(195.75f, 208.06f, 194.91f, 208.21f, 193.96f, 208.21f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.66f to Color(0xFFD80004),
                        start = Offset(119.0f,213.0f), end = Offset(119.0f,189.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(210.43f, 200.42f)
                    lineTo(207.24f, 200.51f)
                    curveTo(207.21f, 200.28f, 207.12f, 200.08f, 206.98f, 199.9f)
                    curveTo(206.83f, 199.72f, 206.64f, 199.58f, 206.4f, 199.48f)
                    curveTo(206.17f, 199.38f, 205.9f, 199.33f, 205.59f, 199.33f)
                    curveTo(205.19f, 199.33f, 204.84f, 199.41f, 204.56f, 199.57f)
                    curveTo(204.28f, 199.73f, 204.14f, 199.95f, 204.15f, 200.22f)
                    curveTo(204.14f, 200.44f, 204.23f, 200.62f, 204.4f, 200.78f)
                    curveTo(204.58f, 200.93f, 204.9f, 201.06f, 205.36f, 201.15f)
                    lineTo(207.46f, 201.55f)
                    curveTo(208.55f, 201.76f, 209.36f, 202.1f, 209.89f, 202.59f)
                    curveTo(210.43f, 203.07f, 210.7f, 203.71f, 210.7f, 204.51f)
                    curveTo(210.7f, 205.25f, 210.48f, 205.9f, 210.04f, 206.46f)
                    curveTo(209.6f, 207.01f, 209.0f, 207.44f, 208.25f, 207.75f)
                    curveTo(207.49f, 208.05f, 206.62f, 208.21f, 205.65f, 208.21f)
                    curveTo(204.09f, 208.21f, 202.86f, 207.89f, 201.96f, 207.25f)
                    curveTo(201.07f, 206.6f, 200.55f, 205.74f, 200.43f, 204.66f)
                    lineTo(203.86f, 204.58f)
                    curveTo(203.93f, 204.97f, 204.13f, 205.28f, 204.45f, 205.49f)
                    curveTo(204.76f, 205.69f, 205.17f, 205.8f, 205.66f, 205.8f)
                    curveTo(206.11f, 205.8f, 206.47f, 205.71f, 206.75f, 205.55f)
                    curveTo(207.03f, 205.38f, 207.17f, 205.16f, 207.17f, 204.89f)
                    curveTo(207.17f, 204.64f, 207.06f, 204.45f, 206.85f, 204.3f)
                    curveTo(206.63f, 204.15f, 206.3f, 204.03f, 205.85f, 203.95f)
                    lineTo(203.94f, 203.58f)
                    curveTo(202.85f, 203.38f, 202.03f, 203.02f, 201.5f, 202.48f)
                    curveTo(200.96f, 201.94f, 200.7f, 201.26f, 200.7f, 200.42f)
                    curveTo(200.7f, 199.69f, 200.89f, 199.07f, 201.29f, 198.55f)
                    curveTo(201.68f, 198.03f, 202.24f, 197.63f, 202.96f, 197.36f)
                    curveTo(203.69f, 197.09f, 204.54f, 196.95f, 205.53f, 196.95f)
                    curveTo(207.0f, 196.95f, 208.17f, 197.26f, 209.02f, 197.88f)
                    curveTo(209.87f, 198.49f, 210.34f, 199.34f, 210.43f, 200.42f)
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
                path(fill = SolidColor(Color(0xFFD80004)), stroke = null, strokeLineWidth = 0.0f,
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
                path(fill = linearGradient(0.34f to Color(0xFFD80004), 1.0f to Color(0xFF340000),
                        start = Offset(121.0f,75.0f), end = Offset(121.0f,114.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(109.63f, 106.32f)
                    curveTo(107.93f, 106.32f, 106.42f, 106.01f, 105.1f, 105.4f)
                    curveTo(103.78f, 104.78f, 102.74f, 103.94f, 101.98f, 102.86f)
                    curveTo(101.22f, 101.79f, 100.83f, 100.55f, 100.79f, 99.16f)
                    horizontalLineTo(106.25f)
                    curveTo(106.29f, 100.01f, 106.64f, 100.71f, 107.29f, 101.23f)
                    curveTo(107.95f, 101.74f, 108.72f, 102.0f, 109.63f, 102.0f)
                    curveTo(110.33f, 102.0f, 110.96f, 101.85f, 111.5f, 101.53f)
                    curveTo(112.04f, 101.22f, 112.47f, 100.79f, 112.78f, 100.23f)
                    curveTo(113.1f, 99.66f, 113.25f, 99.01f, 113.24f, 98.27f)
                    curveTo(113.25f, 97.52f, 113.09f, 96.87f, 112.77f, 96.31f)
                    curveTo(112.46f, 95.75f, 112.03f, 95.31f, 111.48f, 95.0f)
                    curveTo(110.93f, 94.68f, 110.3f, 94.52f, 109.59f, 94.52f)
                    curveTo(108.92f, 94.52f, 108.28f, 94.66f, 107.67f, 94.97f)
                    curveTo(107.07f, 95.27f, 106.62f, 95.68f, 106.31f, 96.2f)
                    lineTo(101.34f, 95.27f)
                    lineTo(102.35f, 82.73f)
                    horizontalLineTo(117.28f)
                    verticalLineTo(87.26f)
                    horizontalLineTo(106.98f)
                    lineTo(106.44f, 92.75f)
                    horizontalLineTo(106.58f)
                    curveTo(106.97f, 92.11f, 107.59f, 91.58f, 108.44f, 91.16f)
                    curveTo(109.31f, 90.73f, 110.29f, 90.52f, 111.39f, 90.52f)
                    curveTo(112.78f, 90.52f, 114.02f, 90.85f, 115.11f, 91.5f)
                    curveTo(116.21f, 92.14f, 117.08f, 93.04f, 117.71f, 94.18f)
                    curveTo(118.34f, 95.33f, 118.66f, 96.64f, 118.66f, 98.11f)
                    curveTo(118.66f, 99.71f, 118.28f, 101.13f, 117.52f, 102.36f)
                    curveTo(116.77f, 103.6f, 115.72f, 104.57f, 114.36f, 105.27f)
                    curveTo(113.01f, 105.97f, 111.44f, 106.32f, 109.63f, 106.32f)
                    close()
                }
                path(fill = linearGradient(0.34f to Color(0xFFD80004), 1.0f to Color(0xFF340000),
                        start = Offset(121.0f,75.0f), end = Offset(121.0f,114.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(131.37f, 106.57f)
                    curveTo(129.34f, 106.57f, 127.59f, 106.09f, 126.12f, 105.13f)
                    curveTo(124.65f, 104.15f, 123.52f, 102.76f, 122.72f, 100.96f)
                    curveTo(121.93f, 99.14f, 121.54f, 96.95f, 121.54f, 94.4f)
                    curveTo(121.55f, 91.84f, 121.95f, 89.68f, 122.74f, 87.9f)
                    curveTo(123.53f, 86.11f, 124.66f, 84.75f, 126.12f, 83.82f)
                    curveTo(127.59f, 82.88f, 129.34f, 82.41f, 131.37f, 82.41f)
                    curveTo(133.4f, 82.41f, 135.15f, 82.88f, 136.62f, 83.82f)
                    curveTo(138.1f, 84.75f, 139.24f, 86.11f, 140.03f, 87.9f)
                    curveTo(140.83f, 89.69f, 141.22f, 91.85f, 141.21f, 94.4f)
                    curveTo(141.21f, 96.96f, 140.82f, 99.15f, 140.02f, 100.97f)
                    curveTo(139.22f, 102.78f, 138.09f, 104.17f, 136.62f, 105.14f)
                    curveTo(135.16f, 106.09f, 133.41f, 106.57f, 131.37f, 106.57f)
                    close()
                    moveTo(131.37f, 101.97f)
                    curveTo(132.58f, 101.97f, 133.57f, 101.35f, 134.32f, 100.11f)
                    curveTo(135.07f, 98.87f, 135.44f, 96.97f, 135.43f, 94.4f)
                    curveTo(135.43f, 92.72f, 135.26f, 91.33f, 134.92f, 90.24f)
                    curveTo(134.58f, 89.14f, 134.1f, 88.32f, 133.5f, 87.78f)
                    curveTo(132.89f, 87.25f, 132.18f, 86.98f, 131.37f, 86.98f)
                    curveTo(130.17f, 86.98f, 129.19f, 87.59f, 128.45f, 88.81f)
                    curveTo(127.71f, 90.02f, 127.33f, 91.88f, 127.33f, 94.4f)
                    curveTo(127.32f, 96.1f, 127.48f, 97.52f, 127.82f, 98.64f)
                    curveTo(128.16f, 99.76f, 128.63f, 100.6f, 129.25f, 101.15f)
                    curveTo(129.86f, 101.69f, 130.57f, 101.97f, 131.37f, 101.97f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.73f to Color(0xFFD80004),
                        start = Offset(138.04f,117.63f), end = Offset(151.62f,134.44f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(142.57f, 126.82f)
                    curveTo(141.85f, 126.17f, 141.81f, 125.06f, 142.46f, 124.35f)
                    curveTo(143.11f, 123.63f, 144.22f, 123.58f, 144.94f, 124.24f)
                    lineTo(148.82f, 127.79f)
                    curveTo(149.53f, 128.44f, 149.58f, 129.55f, 148.92f, 130.26f)
                    curveTo(148.27f, 130.98f, 147.16f, 131.02f, 146.45f, 130.37f)
                    lineTo(142.57f, 126.82f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF340000), 0.73f to Color(0xFFD80004),
                        start = Offset(138.04f,117.63f), end = Offset(151.62f,134.44f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(153.04f, 120.57f)
                    curveTo(153.7f, 119.86f, 154.81f, 119.81f, 155.52f, 120.46f)
                    curveTo(156.24f, 121.11f, 156.28f, 122.22f, 155.63f, 122.94f)
                    lineTo(148.92f, 130.26f)
                    curveTo(148.27f, 130.98f, 147.16f, 131.02f, 146.45f, 130.37f)
                    curveTo(145.73f, 129.72f, 145.68f, 128.61f, 146.34f, 127.9f)
                    lineTo(153.04f, 120.57f)
                    close()
                }
            }
        }
        .build()
        return _completed50Achievement!!
    }

private var _completed50Achievement: ImageVector? = null
