//
//@RunWith(AndroidJUnit4::class)
//class SleepDatabaseTest {
//
//    private lateinit var sleepDao: SleepDatabaseDao
//    private lateinit var db: SleepDatabase
//
//    @Before
//    fun createDb() {
//        val context = InstrumentationRegistry.getInstrumentation().targetContext
//        // Using an in-memory database because the information stored here disappears when the
//        // process is killed.
//        db = Room.inMemoryDatabaseBuilder(context, SleepDatabase::class.java)
//                // Allowing main thread queries, just for testing.
//                .allowMainThreadQueries()
//                .build()
//        sleepDao = db.sleepDatabaseDao
//    }
//
//    @After
//    @Throws(IOException::class)
//    fun closeDb() {
//        db.close()
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun insertAndGetNight() {
//        val night = SleepNight()
//        sleepDao.insert(night)
//        val tonight = sleepDao.getTonight()
//        assertEquals(tonight?.sleepQuality, -1)
//    }
//}
//
