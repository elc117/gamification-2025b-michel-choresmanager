package com.altmann.choresmanager.local

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.worker.WebWorkerDriver
import com.altmann.ChoresDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.w3c.dom.Worker

class JsDatabaseDriverFactory() : DatabaseDriverFactory {
    override fun createDriver(): SqlDriver {
        val worker = Worker(js("""new URL("@cashapp/sqldelight-sqljs-worker/sqljs.worker.js", import.meta.url)"""))
        val driver = WebWorkerDriver(worker)
        ChoresDatabase.Schema.create(driver)
        return driver
    }
}