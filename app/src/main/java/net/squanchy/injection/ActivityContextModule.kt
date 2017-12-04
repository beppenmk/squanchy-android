package net.squanchy.injection

import android.app.Activity
import android.support.v7.app.AppCompatActivity

import dagger.Module
import dagger.Provides

@Module
class ActivityContextModule(private val activity: AppCompatActivity) {

    @Provides
    internal fun appCompatActivityContext(): AppCompatActivity = activity

    @Provides
    internal fun activityContext(): Activity = activity
}
