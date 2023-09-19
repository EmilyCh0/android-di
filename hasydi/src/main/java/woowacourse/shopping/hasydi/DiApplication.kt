package woowacourse.shopping.hasydi

import android.app.Application

open class DiApplication(private val module: Module = DefaultModule()) : Application() {

    lateinit var injector: Injector

    override fun onCreate() {
        super.onCreate()
        module.context = this
        injector = Injector(DiContainer(module))
    }
}