package utils

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HorizontalSpacer(
    width: Dp
) = Spacer(modifier = Modifier.width(width))

@Composable
fun VerticalSpacer(
    height: Dp
) = Spacer(modifier = Modifier.height(height))

@OptIn(ExperimentalMaterialApi::class)
fun BottomSheetScaffoldState.showBottomSheet(
    coroutineScope: CoroutineScope,
) = coroutineScope.launch {
    bottomSheetState.expand()
}
