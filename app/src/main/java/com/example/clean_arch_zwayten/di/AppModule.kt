package com.example.clean_arch_zwayten.di

import android.app.Application
import androidx.room.Room
import com.example.clean_arch_zwayten.data.repository.CarRepositoryImp
import com.example.clean_arch_zwayten.data.source.local.AppDatabase
import com.example.clean_arch_zwayten.data.source.local.dao.CarDao
import com.example.clean_arch_zwayten.domain.repository.CarRepository
import com.example.clean_arch_zwayten.domain.usecase.car.AddToFavorite
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    internal fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            AppDatabase.DB_NAME
        ).allowMainThreadQueries().build()
    }

    @Provides
    internal fun provideCarDao(appDatabase: AppDatabase): CarDao {
        return appDatabase.carDao()
    }

    @Provides

    fun provideCarRepository(cardDao: CarDao):CarRepository {
        return CarRepositoryImp(cardDao)
    }


    @Provides

    fun provideAddToFavorite(addToFavorite: AddToFavorite): AddToFavorite {
        return addToFavorite
    }


/*
    @Provides
    fun provideContext(adapter: CarAdapter): Context {
        return adapter.carAdapter_context
    }

    @Provides
    fun provideContext(fragment: Fragment): Context {
        return fragment.requireContext()
    }
*/
}