package com.scorp.notionclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.scorp.notionclone.ui.theme.NotionCloneTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)

      setContent {
         NotionCloneTheme {

         }
      }
   }
}

