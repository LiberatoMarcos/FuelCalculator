package com.example.fuelcalculator.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fuelcalculator.R
import com.example.fuelcalculator.data.FuelItem

class FuelItemListAdapter() : ListAdapter<FuelItem, FuelItemViewHolder>(FuelItemListAdapter) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuelItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return FuelItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: FuelItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    companion object : DiffUtil.ItemCallback<FuelItem>() {

        override fun areItemsTheSame(oldItem: FuelItem, newItem: FuelItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: FuelItem, newItem: FuelItem): Boolean {
            return oldItem.valor == newItem.valor &&
                    oldItem.kilometro == newItem.kilometro &&
                    oldItem.distancia == newItem.distancia &&
                    oldItem.total == newItem.total
        }

    }
}

class FuelItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val tvValor: TextView = view.findViewById(R.id.textViewValorNum)
    val tvKmLitro: TextView = view.findViewById(R.id.textViewKmLitroNum)
    val tvDistancia: TextView = view.findViewById(R.id.textViewDistanciaNum)
    val tvTotal: TextView = view.findViewById(R.id.textViewTotalNum)

    fun bind(
        item: FuelItem
    ) {
        tvValor.text = item.valor
        tvDistancia.text = item.distancia
        tvKmLitro.text = item.kilometro
        tvTotal.text = item.total
    }
}