package org.firezenk.dslplayground.solutions

import android.net.Uri

@DslMarker
annotation class UriDsl

@UriDsl
class QueryBuilder {
    lateinit var key: String
    lateinit var value: String

    fun build(builder: Uri.Builder): Uri.Builder {
        builder.appendQueryParameter(key, value)
        return builder
    }
}

@UriDsl
class UriBuilder {
    lateinit var scheme: String
    lateinit var authority: String
    private val paths: MutableList<() -> String> = mutableListOf()
    private val queryParams: MutableList<QueryBuilder> = mutableListOf()

    fun build(): Uri = Uri.Builder().apply {
        scheme(scheme)
        authority(authority)
        paths.forEach {
            appendPath(it())
        }
        queryParams.forEach {
            it.build(this)
        }
    }.build()

    fun path(path: () -> String) {
        paths.add(path)
    }

    fun queryParam(function: QueryBuilder.() -> Unit) {
        queryParams.add(QueryBuilder().apply(function))
    }
}

@UriDsl
fun newUri(setup: UriBuilder.() -> Unit): Uri = UriBuilder().apply(setup).build()