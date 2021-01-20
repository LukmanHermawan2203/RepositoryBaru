package com.github.api.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
            "jason",
            "https://avatars1.githubusercontent.com/u/1674?v=4",
            "https://github.com/jason",
            "https://api.github.com/users/jason/followers",
            16,
            "https://api.github.com/users/jason/following{/other_user}",
            6,
            "https://api.github.com/users/jason/repos",
            31

        ))

        list.add(User(
            "jason2",
            "https://avatars1.githubusercontent.com/u/1674?v=4",
            "https://github.com/jason",
            "https://api.github.com/users/jason/followers",
            16,
            "https://api.github.com/users/jason/following{/other_user}",
            6,
            "https://api.github.com/users/jason/repos",
            31

        ))

        list.add(User(
            "jason3",
            "https://avatars1.githubusercontent.com/u/1674?v=4",
            "https://github.com/jason",
            "https://api.github.com/users/jason/followers",
            16,
            "https://api.github.com/users/jason/following{/other_user}",
            6,
            "https://api.github.com/users/jason/repos",
            31

        ))

        list.add(User(
            "jason4",
            "https://avatars1.githubusercontent.com/u/1674?v=4",
            "https://github.com/jason",
            "https://api.github.com/users/jason/followers",
            16,
            "https://api.github.com/users/jason/following{/other_user}",
            6,
            "https://api.github.com/users/jason/repos",
            31

        ))

        list.add(User(
            "jason5",
            "https://avatars1.githubusercontent.com/u/1674?v=4",
            "https://github.com/jason",
            "https://api.github.com/users/jason/followers",
            16,
            "https://api.github.com/users/jason/following{/other_user}",
            6,
            "https://api.github.com/users/jason/repos",
            31

        ))







        return list
    }
}