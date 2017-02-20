package com.stockanlys.entity;

public class Quotation {

	
	public Quotation(Long index, String code, String name, Double changepercent, Double trade, Double open, Double high,
			Double low, Double settlement, Long volume, Double turnoverratio, Long amount, Double per, Double pb,
			Double mktcap, Double nmc)
	{
		super();
		this.index = index;
		this.code = code;
		this.name = name;
		this.changepercent = changepercent;
		this.trade = trade;
		this.open = open;
		this.high = high;
		this.low = low;
		this.settlement = settlement;
		this.volume = volume;
		this.turnoverratio = turnoverratio;
		this.amount = amount;
		this.per = per;
		this.pb = pb;
		this.mktcap = mktcap;
		this.nmc = nmc;
	}

	private Long index;
	
	private String code;
	
	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	private String name;
	
    private Double changepercent;

    private Double trade;

    private Double open;

    private Double high;

    private Double low;

    private Double settlement;

    private Long volume;

    private Double turnoverratio;

    private Long amount;

    private Double per;

    private Double pb;

    private Double mktcap;

    private Double nmc;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Double getChangepercent() {
        return changepercent;
    }

    public void setChangepercent(Double changepercent) {
        this.changepercent = changepercent;
    }

    public Double getTrade() {
        return trade;
    }

    public void setTrade(Double trade) {
        this.trade = trade;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getSettlement() {
        return settlement;
    }

    public void setSettlement(Double settlement) {
        this.settlement = settlement;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getTurnoverratio() {
        return turnoverratio;
    }

    public void setTurnoverratio(Double turnoverratio) {
        this.turnoverratio = turnoverratio;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
        this.per = per;
    }

    public Double getPb() {
        return pb;
    }

    public void setPb(Double pb) {
        this.pb = pb;
    }

    public Double getMktcap() {
        return mktcap;
    }

    public void setMktcap(Double mktcap) {
        this.mktcap = mktcap;
    }

    public Double getNmc() {
        return nmc;
    }

    public void setNmc(Double nmc) {
        this.nmc = nmc;
    }

	@Override
	public String toString()
	{
		return "Quotation [index=" + index + ", code=" + code + ", name=" + name + ", changepercent=" + changepercent
				+ ", trade=" + trade + ", open=" + open + ", high=" + high + ", low=" + low + ", settlement="
				+ settlement + ", volume=" + volume + ", turnoverratio=" + turnoverratio + ", amount=" + amount
				+ ", per=" + per + ", pb=" + pb + ", mktcap=" + mktcap + ", nmc=" + nmc + "]";
	}
    
    
}