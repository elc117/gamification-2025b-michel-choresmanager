package com.altmann.choresmanager.res

import androidx.compose.ui.graphics.vector.ImageVector
import com.altmann.choresmanager.res.myiconpack.Completed10Achievement
import com.altmann.choresmanager.res.myiconpack.Completed1Achievement
import com.altmann.choresmanager.res.myiconpack.Completed25Achievement
import com.altmann.choresmanager.res.myiconpack.Completed50Achievement
import com.altmann.choresmanager.res.myiconpack.Completed5Achievement
import com.altmann.choresmanager.res.myiconpack.Created100Achievement
import com.altmann.choresmanager.res.myiconpack.Created10Achievement
import com.altmann.choresmanager.res.myiconpack.Created25Achievement
import com.altmann.choresmanager.res.myiconpack.Created50Achievement
import com.altmann.choresmanager.res.myiconpack.Created5Achievement
import com.altmann.choresmanager.res.myiconpack.Duration10Achievement
import com.altmann.choresmanager.res.myiconpack.Duration12Achievement
import com.altmann.choresmanager.res.myiconpack.Duration2Achievement
import com.altmann.choresmanager.res.myiconpack.Duration4Achievement
import com.altmann.choresmanager.res.myiconpack.Duration6Achievement
import kotlin.collections.List as ____KtList

public object MyIconPack

private var __AllIcons: ____KtList<ImageVector>? = null

public val MyIconPack.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Completed10Achievement, Completed1Achievement, Completed25Achievement,
        Completed50Achievement, Completed5Achievement, Created100Achievement, Created10Achievement,
        Created25Achievement, Created50Achievement, Created5Achievement, Duration10Achievement,
        Duration12Achievement, Duration2Achievement, Duration4Achievement, Duration6Achievement)
    return __AllIcons!!
  }
